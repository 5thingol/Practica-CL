package interp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.List;

/** Class responsible for transforming the structured data obtained from the tree to SVG language. */

public class SVGParser {

	private class Animation {
		public String id;
		public Data data;
		public Animation(String id, Data data) {
			this.id = id;
			this.data = data;
		}
	}

	private class SVGGroup extends Animation {
		
		// Objectes que es troben dins del grup
		private List<String> idObjects;

		public SVGGroup(String id, Data initialProperties) {
			super(id, initialProperties);
			this.id = id;
			this.data = initialProperties;
		}

		public void setObjectsIds(List<String> objects) {
			this.idObjects = objects;
		}

		public List<String> getObjectsIds() {
			return idObjects;
		}

		public void addObject(String id) {
			idObjects.add(id);
		}

	}

	/** Nom del fitxer al que s'escriura el SVG */
	private String filename;

	/** Conte el fitxer SVG escrit fins al moment */
	private String SVG;

	/** Mapa amb les variables de tipus objecte tractats actualment */
	private HashMap<String, List<Animation> > SVGObjects;
	
	public SVGParser() {
		filename = "SimpleAnimation.svg";
		SVG = "";
		SVGObjects = new HashMap<String, List<Animation> >();
	}

	public SVGParser(String filename) {
		this.filename = filename;
		SVG = "";
		SVGObjects = new HashMap<String, List<Animation> >();
	}

	/** Crea un objecte de tipus SVG amb la data data com a propietats inicials */
	public void createSVGObject(String id, Data data) {
		List<Animation> dades = SVGObjects.get(id);
      	List<Animation> newDades = new ArrayList<Animation>();
      	Animation anim = new Animation("InitialProperties",data);
       	newDades.add(anim);
        if (dades == null) {
        	SVGObjects.put(id, newDades); 
		} else {
        	writeObjectToSVGFile(id, dades);
        	SVGObjects.put(id,newDades);
        } 
	}

	/** Crea un grup agrupant diversos objectes */
	public void createSVGGroup(String id, List<String> idObjects) {
		String n = null;
		Data newData = new Data("Group",-1,-1,-1,-1,n,-1,-1,-1, n);
		SVGGroup group = new SVGGroup(id, newData);
		group.setObjectsIds(idObjects);

		for (String s : idObjects) {
			List<Animation> objecte = SVGObjects.get(s);
			if (objecte == null) throw new RuntimeException("At least one of the grouping objects doesn't exists");
			Animation a = objecte.get(0);
			a.data.setGroup(id);
			objecte.set(0, a);
			SVGObjects.put(s, objecte);
		}
	}

	
	/** Afegeix a l'objecte idObject previament creat una animacio */ 
	public void addSVGAnimation(String idObject, String idAnimation, Data animation) {
		Animation anim = new Animation(idAnimation, animation);
		List<Animation> aux = SVGObjects.get(idObject);
		aux.add(anim);
		SVGObjects.put(idObject, aux);
	}


	/** Escriu i neteja les variables de tipus objecte tractats actualment. S'ha de cridar quan s'acabi una funcio */
	public void clearObjects() {
		for (Entry<String, List<Animation> > entry : SVGObjects.entrySet()) {
    		String key = entry.getKey();
	    	List<Animation> dades = entry.getValue();
	    	writeObjectToSVGFile(key, dades);
		}
		SVGObjects.clear();
	}



	/** FUNCIONS PER A ESCRIURE AL SVG */

	private String propertiesToString(Data data) {
		if (!data.isObject()) throw new RuntimeException("Data is not an object");

		String properties = "";
		if (data.getTipusObject().equals("Rectangle")) {
			properties += " x=\"" + data.getObjectCoordX() + "\"";
			properties += " y=\"" + data.getObjectCoordY() + "\"";
			properties += " width=\"" + data.getObjectWidth() + "\"";
			properties += " height=\"" + data.getObjectHeight() + "\"";
		} else if (data.getTipusObject().equals("Circle") || data.getTipusObject().equals("Ellipse")) {
			properties += " cx=\"" + data.getObjectCoordX() + "\"";
			properties += " cy=\"" + data.getObjectCoordY() + "\"";
			
			if (data.getTipusObject().equals("Circle")) properties += " r=\"" + data.getObjectRadiX() + "\"";
			else {
				properties += " rx=\"" + data.getObjectRadiX() + "\"";
				properties += " ry=\"" + data.getObjectRadiY() + "\"";
			}
		} else if (data.getTipusObject().equals("Line")) {
			properties += " x1=\"" + data.getObjectCoordX() + "\"";
			properties += " y1=\"" + data.getObjectCoordY() + "\"";
			properties += " x2=\"" + data.getObjectRadiX() + "\"";
			properties += " y2=\"" + data.getObjectRadiY() + "\"";
		}
		
		if (data.getObjectColor() != null) properties += " fill=\"" + data.getObjectColor() + "\"";
		properties += " transform=\"rotate(" + data.getObjectRotation() + ")\"";
		

		// TODO: IMPLEMENTAR ATTRIBUTES SOBRANTS
		//if (data.getAttributes() != null) properties += data.getAttributes();

		return properties;
	}

	private String animationToString(Animation a) {
		Data anim = a.data;

		if (!anim.isAnimation()) throw new RuntimeException("Added element to object is not an animation");
		String animation = "<animate";																// Animation element

		animation += " id=\"" + a.id + "\"";														// Animation id
		
		if (anim.getTipusAnimation().equals("Modify")) {
			
			if (anim.getAnimationAttribute() == null) throw new RuntimeException("Modify animation has no attribute");
			if (anim.getAnimationFrom() == null) throw new RuntimeException("Modify animation has no from attribute");
			if (anim.getAnimationTo() == null) throw new RuntimeException("Modify animation has no to attribute");

			animation += " attributeName=\"" + anim.getAnimationAttribute() + "\" attributeType=\"XML\" from=\"" + 
				anim.getAnimationFrom() + "\" to=\"" + anim.getAnimationTo() + "\" begin=\"" + 
				anim.getAnimationBegin()	+ "s\" dur=\"" + (anim.getAnimationEnd() - anim.getAnimationBegin())
				+ "s\"";
		
		} else if (anim.getTipusAnimation().equals("Move")) {
			
			//if (anim.getAnimationCoordX() == null) throw new RuntimeException("Move animation has no X coordinate");
			//if (anim.getAnimationCoordY() == null) throw new RuntimeException("Move animation has no Y coordinate");

			animation += " attributeName=\"x\" attributeType=\"XML\" to=\"" + anim.getAnimationCoordX() + "\" begin=\"" 
			+ anim.getAnimationBegin() + "s\" dur=\"" + (anim.getAnimationEnd() - anim.getAnimationBegin()) + 
				"s\"";
			
			if (anim.getAnimationFill() != null) animation += "fill=\"" + anim.getAnimationFill() + "\"";
			
			animation += "/><animate attributeName=\"y\" attributeType=\"XML\" to=\"" + 
				anim.getAnimationCoordY() + "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" + 
				(anim.getAnimationEnd() - anim.getAnimationBegin()) + "s\"";

		} else if (anim.getTipusAnimation().equals("Translate")) { // QUAN HI HAGI TRANSLATE -> ANIMATEMOTION
			
			//if (anim.getAnimationCoordX() == null) throw new RuntimeException("Translate animation has no X coordinate");
			//if (anim.getAnimationCoordY() == null) throw new RuntimeException("Translate animation has no Y coordinate");

			animation += "Transform attributeName=\"transform\" attributeType=\"XML\" type=\"translate\" to=\"" 
				+ anim.getAnimationCoordX() + " " + anim.getAnimationCoordY() + "\" begin=\"" + anim.getAnimationBegin() + 
				"s\" dur=\"" + (anim.getAnimationEnd() - anim.getAnimationBegin()) + "s\"";
			
		} else if (anim.getTipusAnimation().equals("Rotate")) {
			
			animation += "Transform attributeName=\"transform\" attributeType=\"XML\" type=\"rotate\" to=\"" 
				+ anim.getAnimationRotation() + "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" 
				+ (anim.getAnimationEnd() - anim.getAnimationBegin()) + "s\"";
		
		} else if (anim.getTipusAnimation().equals("Destroy")) {
			
			animation = "<set visibility=\"hidden\" begin=\"" + anim.getAnimationBegin() + "s\"";
		
		}

		// TODO: DEBUUG
		if (anim.getAnimationFill() != null) animation += "fill=\"" + anim.getAnimationFill() + "\"/>";
		return animation;
	}

			
	private String toSvgBasicShape(String tipus) {
		if (tipus.equals("Rectangle")) return "rect";
		if (tipus.equals("Circle")) return "circle";
		if (tipus.equals("Ellipse")) return "ellipse";
		if (tipus.equals("Line")) return "line";
		if (tipus.equals("Group")) return "g";
	}

	private void writeObjectToSVGFile(String id, List<Animation> dades) {
		String newObject = "<";
		Data initialProperties = dades.get(0).data;
		if (initialProperties.getObjectGroup() != null) {
			newObject += "defs><";
		}

		String basicShape = toSvgBasicShape(initialProperties.getTipusObject());
		newObject += basicShape;
		newObject += propertiesToString(initialProperties) + ">";
		
		dades.remove(0);

		if (initialProperties.getTipusObject().equals("Group")) {
			SVGGroup group = (SVGGroup) dades.get(0);
			for (String s : group.getObjectsIds()) {
				newObject += "<use xlink:href=\"#" + s + "\"></use>";
			}
		}

		for (Animation anim : dades) {
			newObject += animationToString(anim);
		}

		newObject += "</" + basicShape + ">";

		if (initialProperties.getObjectGroup() != null) {
			newObject += "</defs>";
		}

		SVG = SVG + newObject;

	}

	/** Retorna la capcalera que ha de tenir el fitxer SVG */
	private String getCapcalera() {
		return "<svg>";
	}

	/** Escriu el fitxer SVG final. S'ha de cridar al final de l'excecucio del programa*/
	public void writeSVGFile() {
		SVG = getCapcalera() + SVG;
		SVG += "\n</svg>\n";
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(filename+".svg"), "utf-8"))) {
   			writer.write(SVG);
   		}
	}
}