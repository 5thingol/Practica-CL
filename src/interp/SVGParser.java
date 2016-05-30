package interp;

import java.nio.file.Files; 
import java.nio.file.Paths;
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
import java.io.*;

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
		filename = "SimpleAnimation";
		SVG = "";
		SVGObjects = new HashMap<String, List<Animation> >();
	}

	public SVGParser(String filename) {
		this.filename = filename;
		SVG = "";
		SVGObjects = new HashMap<String, List<Animation> >();
	}

	/** Adds the initial shapes definitions to the SVG */
	public void addDefinitions(AslTree t) {
		if (t.getChildCount() == 0) return;
		SVG += "<defs>\n";

		for (int i = 0; i < t.getChildCount(); i++) {
			SVG += "<path id=\"" + t.getChild(i).getChild(0) + "\" d=" + t.getChild(i).getChild(1);

			for (int j = 0; j < t.getChild(i).getChild(2).getChildCount(); j++) {
				String att = t.getChild(i).getChild(2).getChild(j).getText();
				if (att.equals("color")) att = "fill";
				String[] value = t.getChild(i).getChild(2).getChild(j).getChild(0).getText().split("\"");
				int index = 1;
				if (value.length == 1) index = 0;
				SVG += " " + att + "=\"" 
					+ value[index] + "\"";
			}

			SVG += "/>\n";
		}	

		SVG += "</defs>\n";
	}

	/** Crea un objecte de tipus SVG amb la data data com a propietats inicials */
	public void createSVGObject(String id, Data data) {
 		System.out.print("creating "+data.getTipusObject());

		List<Animation> dades = SVGObjects.get(id);
      	List<Animation> newDades = new ArrayList<Animation>();
      	Animation anim = new Animation("InitialProperties",data);
       	newDades.add(anim);
        if (dades == null) {
        	SVGObjects.put(id, newDades); 
		} else {
			System.out.println("substitute object");
        	writeObjectToSVGFile(id, dades);
        	SVGObjects.put(id,newDades);
        } 
	}

	/** Crea un grup agrupant diversos objectes */
	public void createSVGGroup(String id, List<String> idObjects) {
		String n = null;
		Data newData = new Data("Group",-1,-1,-1,-1,n,-1,"",-1,-1, -1, n);
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

		List<Animation> dades = SVGObjects.get(id);
      	List<Animation> newDades = new ArrayList<Animation>();
      	newDades.add(group);
        if (dades == null) {

        	SVGObjects.put(id, newDades); 
		} else {
			System.out.println("substitute object");
        	writeObjectToSVGFile(id, dades);
        	SVGObjects.put(id,newDades);
        } 

	}

	
	/** Afegeix a l'objecte idObject previament creat una animacio */ 
	public void addSVGAnimation(String idObject, String idAnimation, Data animation) {
		
                
		Animation anim = new Animation(idAnimation, animation);
		List<Animation> aux = SVGObjects.get(idObject);
		aux.add(anim);
		System.out.println(idAnimation);
		SVGObjects.put(idObject, aux);
	}


	/** Escriu i neteja les variables de tipus objecte tractats actualment. S'ha de cridar quan s'acabi una funcio */
	public void clearObjects() {
		for (Entry<String, List<Animation> > entry : SVGObjects.entrySet()) {
    		String key = entry.getKey();
	    	List<Animation> dades = entry.getValue();
	    	System.out.println("Clearing objects");
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
		} else if (!data.getTipusObject().equals("Group")) {
			properties += " x=\"" + data.getObjectCoordX() + "\"";
			properties += " y=\"" + data.getObjectCoordY() + "\"";
			properties += " width=\"" + data.getObjectWidth() + "\"";
			properties += " height=\"" + data.getObjectHeight() + "\"";
		} else if (data.getTipusObject().equals("Text")) {
			properties += " x=\"" + data.getObjectCoordX() + "\"";
			properties += " y=\"" + data.getObjectCoordY() + "\"";
			properties += " width=\"" + data.getObjectWidth() + "\"";
			properties += " height=\"" + data.getObjectHeight() + "\"";
		}

		if (!data.getTipusObject().equals("Group")) {
		
			if (data.getObjectColor() != null) properties += " fill=\"" + data.getObjectColor() + "\"";
			if (!data.getObjectStroke().equals("")) properties += " stroke= \"" + data.getObjectStroke() + "\"";
			if (data.getObjectStrokeWidth() != 0) properties += " stroke-width= \"" + data.getObjectStrokeWidth() + "\"";
			properties += " transform=\"rotate(" + data.getObjectRotation() + ")\"";
		}
		
		// TODO: IMPLEMENTAR ATTRIBUTES SOBRANTS
		//if (data.getAttributes() != null) properties += data.getAttributes();

		return properties;
	}

	private String animationToString(Animation a) {
		Data anim = a.data;

		if (!anim.isAnimation()) throw new RuntimeException("Added element to object is not an animation");
		String animation = "<animate";																// Animation element

		
		if (anim.getTipusAnimation().equals("Modify")) {
			animation += " id=\"" + a.id + "\"";														// Animation id
			
			if (anim.getAnimationAttribute() == null) throw new RuntimeException("Modify animation has no attribute");
			if (anim.getAnimationFrom() == null) throw new RuntimeException("Modify animation has no from attribute");
			if (anim.getAnimationTo() == null) throw new RuntimeException("Modify animation has no to attribute");

			String attribute = anim.getAnimationAttribute();

			if (attribute.equals("color")) attribute = "fill";

			animation += " attributeName=\"" + attribute + "\" attributeType=\"XML\" from=\"" + 
				anim.getAnimationFrom() + "\" to=\"" + anim.getAnimationTo() + "\" begin=\"" + 
				anim.getAnimationBegin()	+ "s\" dur=\"" + (anim.getAnimationEnd() - anim.getAnimationBegin())
				+ "s\"";
		
		} else if (anim.getTipusAnimation().equals("Move")) {
			animation += " id=\"" + a.id + "\"";														// Animation id
		
			//if (anim.getAnimationCoordX() == null) throw new RuntimeException("Move animation has no X coordinate");
			//if (anim.getAnimationCoordY() == null) throw new RuntimeException("Move animation has no Y coordinate");

			animation += " attributeName=\"x\" attributeType=\"XML\" to=\"" + anim.getAnimationCoordX() + "\" begin=\"" 
			+ anim.getAnimationBegin() + "s\" dur=\"" + (anim.getAnimationEnd() - anim.getAnimationBegin()) + 
				"s\"";
						
			animation += "/><animate attributeName=\"y\" attributeType=\"XML\" to=\"" + 
				anim.getAnimationCoordY() + "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" + 
				(anim.getAnimationEnd() - anim.getAnimationBegin()) + "s\"";

		} else if (anim.getTipusAnimation().equals("Translate")) { // QUAN HI HAGI TRANSLATE -> ANIMATEMOTION
			animation += "Motion id=\"" + a.id + "\"";														// Animation id

			animation += " attributeName=\"transform\" type=\"translate\" to=\"" +  anim.getAnimationCoordX() + " " + anim.getAnimationCoordY() 
			+ "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" + (anim.getAnimationEnd() - anim.getAnimationBegin()) 
			+ "s\"";
			
		} else if (anim.getTipusAnimation().equals("Scale")) { 
			animation += "Transform id=\"" + a.id + "\"";														// Animation id

			animation += " path=\"M 0 0 L "+  anim.getAnimationCoordX() + " " + anim.getAnimationCoordY() 
			+ "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" + (anim.getAnimationEnd() - anim.getAnimationBegin()) 
			+ "s\"";
			
			//animation += " attributeName=\"transform\" attributeType=\"XML\" type=\"scale\" to=\"" 
			//	+ anim.getAnimationTo() + "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" 
			//	+ (anim.getAnimationEnd() - anim.getAnimationBegin()) + "s\"";
			
		} else if (anim.getTipusAnimation().equals("Rotate")) {
			animation += "Transform id=\"" + a.id + "\"";														// Animation id

			animation += " attributeName=\"transform\" attributeType=\"XML\" type=\"rotate\" to=\"" 
				+ anim.getAnimationRotation() + "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" 
				+ (anim.getAnimationEnd() - anim.getAnimationBegin()) + "s\"";
		
		} else if (anim.getTipusAnimation().equals("Destroy")) {
			
			animation = "<set attributeName=\"visibility\" attributeType=\"XML\" to=\"hidden\" begin=\"" + anim.getAnimationBegin() 
			+ "s\" dur=\"" + anim.getAnimationBegin()+"s\"";
		
		}

		// TODO: DEBUUG
		if (anim.getAnimationFill() != null) animation += " fill=\"" + anim.getAnimationFill() + "\"/>";
		return animation;
	}

			
	private String toSvgBasicShape(String tipus) {
		if (tipus.equals("Rectangle")) return "rect";
		if (tipus.equals("Circle")) return "circle";
		if (tipus.equals("Ellipse")) return "ellipse";
		if (tipus.equals("Line")) return "line";
		if (tipus.equals("Group")) return "g";
		if (tipus.equals("Text")) return "text";
		return "use xlink:href=\"#" + tipus + "\"";
	}

	private String getShapeEnding(String tipus) {
		if (tipus.equals("Rectangle")) return "rect";
		if (tipus.equals("Circle")) return "circle";
		if (tipus.equals("Ellipse")) return "ellipse";
		if (tipus.equals("Line")) return "line";
		if (tipus.equals("Group")) return "g";
		if (tipus.equals("Text")) return "text";

		return "use";
	}

	private void writeObjectToSVGFile(String id, List<Animation> dades) {
		String newObject = "<";
		Data initialProperties = dades.get(0).data;
		System.out.print(dades.get(0).data);
		if (initialProperties.getObjectGroup() != null) {
			newObject += "defs><";
		}

		String basicShape = toSvgBasicShape(initialProperties.getTipusObject());
		newObject += basicShape;
		newObject += " id=\"" + id + "\"" + propertiesToString(initialProperties) + ">\n";
		
		if (initialProperties.getTipusObject().equals("Group")) {
			initialProperties.getTipusObject();
			SVGGroup group = (SVGGroup) dades.get(0);
			for (String s : group.getObjectsIds()) {
				newObject += "<use xlink:href=\"#" + s + "\"></use>\n";
			}
		} else if (initialProperties.getTipusObject().equals("Text")) {
			newObject += initialProperties.getStringValue();
		}

		dades.remove(0);

		for (Animation anim : dades) {
			newObject += animationToString(anim);
		}

		newObject += "</" + getShapeEnding(initialProperties.getTipusObject()) + ">\n";

		if (initialProperties.getObjectGroup() != null) {
			newObject += "</defs>\n";
		}

		SVG = SVG + newObject;

	}

	/** Retorna la capcalera que ha de tenir el fitxer SVG */
	private String getCapcalera() {
		return "<svg width=\"1000\" height=\"600\">\n";
	}

	/** Escriu el fitxer SVG final. S'ha de cridar al final de l'excecucio del programa*/
	public void writeSVGFile() {
		SVG = getCapcalera() + SVG;
		SVG += "\n</svg>\n";
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(filename+".svg"), "utf-8"))) {
   			writer.write(SVG);
   		} catch (IOException e) {
   			System.err.println("SVG file writing error: " + e.getMessage());
   		}
	}


	/** Copies the content of an existing SVG file into the current SVG file*/
	public void addExistingSVGFileContents() {
		try {
			String content = new String(Files.readAllBytes(Paths.get(filename + ".svg")));
			String[] file = content.split("<");
			
			for (int i = 2; i < file.length - 1; i++) {
				SVG += "<" + file[i];
			}
		} catch (IOException e) {
			System.err.println("SVG file reading error: " + e.getMessage());
		}
	}

}