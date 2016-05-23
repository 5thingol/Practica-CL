package interp;


/** Class that implements the interpreter of the language. */

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

		public SVGGroup(String id, Data initialProperties, List<String> idObjects) {
			this.id = id;
			this.data = initialProperties;
			this.idObjects = idObjects;
			objects = new ArrayList<Animation>();
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
		SVGObjects = HashMap<String, List<Animation> >();
		closedGroups = HashMap<String, List<SVGGroup> >();
	}

	public SVGParser(String filename) {
		this.filename = filename;
		SVG = "";
		SVGObjects = HashMap<String, List<Animation> >();
	}

	/** Crea un objecte de tipus SVG amb la data data com a propietats inicials */
	public void createSVGObject(String id, Data data) {
		List<Animation> dades = SVGObjects.get(id);
      	List<Animation> newDades = new List<Animation>();
      	Animation anim = Animation("InitialProperties",data);
       	newDades.add(anim);
        if (dades == null) {
        	SVGObjects.put(id, newDades); 
		} else {
        	writeObjectToSVGFile(id, dades);
        	SVGObjects.setData(newDades);
        } 
	}

	/** Crea un grup agrupant diversos objectes */
	public void createSVGGroup(String id, List<String> idObjects) {
		Data newData = new Data("Group", -1,-1,-1,-1,null,-1,-1,-1);
		SVGGroup group = new SVGGroup(id, newData, idObjects);

		for (String s : idObjects) {
			List<Animation> objecte = SVGObjects.get(s);
			if (objecte == null) Throw new RuntimeException("At least one of the grouping objects doesn't exists");
			Animation a = objecte.get(0);
			a.data.setGroup(id);
			objecte.set(0, a);
			SVGObjects.put(s, objecte);
		}
	}

	
	/** Afegeix a l'objecte idObject previament creat una animacio */ 
	public void addSVGAnimation(String idObject, String idAnimation, Data animation) {
		Animation anim = Animation(idAnimation, animation);
		List<Animation> aux = SVGObjects.get(idObject);
		aux.add(anim);
		SVGObjects.put(idObject, aux);
	}


	/** Escriu i neteja les variables de tipus objecte tractats actualment. S'ha de cridar quan s'acabi una funcio */
	public void clearObjects() {
		for (Map.Entry<String, List<Animation> > entry : SVGObjects.entrySet()) {
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
			if (data.getObjectCoordX() != null) properties += " x=\"" + data.getObjectCoordX() + "\"";
			if (data.getObjectCoordY() != null) properties += " y=\"" + data.getObjectCoordY() + "\"";
			if (data.getObjectWidth() != null) properties += " width=\"" + data.getObjectWidth() + "\"";
			if (data.getObjectHeight() != null) properties += " height=\"" + data.getObjectHeight() + "\"";
		} else if (data.getTipusObject().equals("Circle") || data.getTipusObject().equals("Ellipse")) {
			if (data.getObjectCoordX() != null) properties += " cx=\"" + data.getObjectCoordX() + "\"";
			if (data.getObjectCoordY() != null) properties += " cy=\"" + data.getObjectCoordY() + "\"";
			
			if (data.getTipusObject().equals("Circle") && data.getObjectRadi() != null) properties += " r=\"" + data.getObjectRadi() + "\"";
			else {
				if (data.getObjectRadiX() != null) properties += " rx=\"" + data.getObjectRadiX() + "\"";
				if (data.getObjectRadiY() != null) properties += " ry=\"" + data.getObjectRadiY() + "\"";
			}
		} else if (data.getTipusObject().equals("Line")) {
			if (data.getObjectCoordX() != null) properties += " x1=\"" + data.getObjectCoordX() + "\"";
			if (data.getObjectCoordY() != null) properties += " y1=\"" + data.getObjectCoordY() + "\"";
			if (data.getObjectRadiX() != null) properties += " x2=\"" + data.getObjectRadiX() + "\"";
			if (data.getObjectRadiY() != null) properties += " y2=\"" + data.getObjectRadiY() + "\"";
		}
		
		if (data.getObjectColor() != null) properties += " fill=\"" + data.getObjectColor() + "\"";
		if (data.getObjectRotation() != null) properties += " transform=\"rotate(" + data.getObjectRotation() + ")\"";
		if (data.getAttributes() != null) properties += data.getAttributes();

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
				anim.getAnimationBegin()	+ "s\" dur=\"" + anim.getAnimationEnd()-anim.getAnimationBegin() 
				+ "s\"";
		
		} else if (anim.getTipusAnimation().equals("Move")) {
			
			if (anim.getAnimationCoordX() == null) throw new RuntimeException("Move animation has no X coordinate");
			if (anim.getAnimationCoordY() == null) throw new RuntimeException("Move animation has no Y coordinate");

			animation += " attributeName=\"x\" attributeType=\"XML\" to=\"" + anim.getAnimationCoordX() + "\" 
				begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" + anim.getAnimationEnd()-anim.getAnimationBegin() + 
				"s\"";
			
			if (anim.getAnimationFill() != null) animation += "fill=\"" + anim.getAnimationFill() + "\"";
			
			animation += "/><animate attributeName=\"y\" attributeType=\"XML\" to=\"" + 
				anim.getAnimationCoordY() + "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" + 
				anim.getAnimationEnd()-anim.getAnimationBegin() + "s\"";

		} else if (anim.getTipusAnimation().equals("Translate")) { // QUAN HI HAGI TRANSLATE -> ANIMATEMOTION
			
			if (anim.getAnimationCoordX() == null) throw new RuntimeException("Translate animation has no X coordinate");
			if (anim.getAnimationCoordY() == null) throw new RuntimeException("Translate animation has no Y coordinate");

			animation += "Transform attributeName=\"transform\" attributeType=\"XML\" type=\"translate\" to=\"" 
				+ anim.getAnimationCoordX() + " " + anim.getAnimationCoordY() + "\" begin=\"" + anim.getAnimationBegin() + 
				"s\" dur=\"" + anim.getAnimationEnd()-anim.getAnimationBegin() "s\"";
			
		} else if (anim.getTipusAnimation().equals("Rotate")) {
			
			if (anim.getAnimationRotation() == null) throw new RuntimeException("Rotation animation has no rotation angle");

			animation += "Transform attributeName=\"transform\" attributeType=\"XML\" type=\"rotate\" to=\"" 
				+ anim.getAnimationRotation() + "\" begin=\"" + anim.getAnimationBegin() + "s\" dur=\"" 
				+ anim.getAnimationEnd()-anim.getAnimationBegin() "s\"";
		
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
		Dades initialProperties = dades.get(0).data;
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