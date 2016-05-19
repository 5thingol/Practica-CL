package interp;

/** Class that implements the interpreter of the language. */

public class SVGParser {

	private class Animation {
		String id;
		Data data;
		public Animation(String id, Data data) {
			this.id = id;
			this.data = data;
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

	/** Afegeix a l'objecte idObject previament creat una animacio */ 
	public void addSVGAnimation(String idObject, String idAnimation, Data animation) {
		Animation anim = Animation(idAnimation, animation);
		List<Animation> aux = SVGObjects.get(idObject);
		aux.add(anim);
		SVGObjects.put(idObject, aux);
	}


	/** Escriu i neteja les variables de tipus objecte tractats actualment. S'ha de cridar quan s'acabi una funcio */
	public void clearObjects() {
		for (Map.Entry<String, List<Data> > entry : SVGObjects.entrySet()) {
    		String key = entry.getKey();
	    	List<Data> dades = entry.getValue();
	    	writeObjectToSVGFile(key, dades);
		}
		SVGObjects.clear();
	}



	/** FUNCIONS PER A ESCRIURE AL SVG */

	private String propertiesToString(Data data) {
		String properties = "";
		if (data.getTipus().equals("Rectangle")) {
			if (data.getObjectCoordX() != null) properties += " x=\"" + data.getObjectCoordX() + "\"";
			if (data.getObjectCoordY() != null) properties += " y=\"" + data.getObjectCoordY() + "\"";
			if (data.getObjectWidth() != null) properties += " width=\"" + data.getObjectWidth() + "\"";
			if (data.getObjectHeight() != null) properties += " height=\"" + data.getObjectHeight() + "\"";
		} else if (data.getTipus().equals("Circle") || data.getTipus().equals("Ellipse")) {
			if (data.getObjectCoordX() != null) properties += " cx=\"" + data.getObjectCoordX() + "\"";
			if (data.getObjectCoordY() != null) properties += " cy=\"" + data.getObjectCoordY() + "\"";
			
			if (data.getTipus().equals("Circle") && data.getObjectRadi() != null) properties += " r=\"" + data.getObjectRadi() + "\"";
			else {
				if (data.getObjectRadiX() != null) properties += " rx=\"" + data.getObjectRadiX() + "\"";
				if (data.getObjectRadiY() != null) properties += " ry=\"" + data.getObjectRadiY() + "\"";
			}
		} else if (data.getTipus().equals("Line")) {
			if (data.getObjectCoordX() != null) properties += " x1=\"" + data.getObjectCoordX() + "\"";
			if (data.getObjectCoordY() != null) properties += " y1=\"" + data.getObjectCoordY() + "\"";
			if (data.getObjectRadiX() != null) properties += " x2=\"" + data.getObjectRadiX() + "\"";
			if (data.getObjectRadiY() != null) properties += " y2=\"" + data.getObjectRadiY() + "\"";
		}
		
		if (data.getObjectColor() != null) properties += " fill=\"" + data.getObjectColor() + "\"";
		if (data.getRotation() != null) properties += " transform=\"rotate(" + data.getRotation() + ")\"";
		if (data.getAttributes() != null) properties += data.getAttributes();

		return properties;
	}

	private String animationToString(Animation a) {
		String animation = "<animate";
		Data anim = a.data;

		// TODO: complete the function

		if (anim.getTipus().equals("Modify")) {
			animation += " attributeName=\"" + anim.getAttribute() + "\"";
		} else if (anim.getTipus().equals("Move")) {

		} else if (anim.getTipus().equals("Translate")) { // QUAN HI HAGI TRANSLATE -> ANIMATEMOTION

			
		} else if (anim.getTipus().equals("Rotate")) {

		} else if (anim.getTipus().equals("Destroy")) {

		}


		animation += "/>";
		return animation;
	}

	private String toSvgBasicShape(String tipus) {
		if (tipus.equals("Rectangle")) return "rect";
		if (tipus.equals("Circle")) return "circle";
		if (tipus.equals("Ellipse")) return "ellipse";
		if (tipus.equals("Line")) return "line";
	}

	private void writeObjectToSVGFile(String id, List<Animation> dades) {
		String newObject = "<";
		Dades initialProperties = dades.get(0).data;
		newObject += toSvgBasicShape(initialProperties.getTipus());
		newObject += propertiesToString(initialProperties);
		
		dades.remove(0);

		for (Animation anim : dades) {
			newObject += animationToString(anim);
		}

		newObject += "/>";

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