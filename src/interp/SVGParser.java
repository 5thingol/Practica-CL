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
	public void createObject(String id, Data data) {
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
	public void addAnimation(String idObject, String idAnimation, Data animation) {
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

	private String propertiesToString(Data data) {
		String properties = " ";
		if (data.getObjectCoordX() != null) properties += "x=\"" + data.getObjectCoordX() + "\"";
			// TODO: ADD ALL PROPERTIES
		return properties;
	}

	private String animationToString(Animation anim) {
		String animation = "<";

		// TODO: make the function

		return animation;
	}

	private void writeObjectToSVGFile(String id, List<Animation> dades) {
		String newObject = "<";
		Dades initialProperties = dades.get(0).data;
		newObject += initialProperties.tipus;
		newObject += propertiesToString(initialProperties);
		
		dades.remove(0);

		for (Animation anim : dades) {
			newObject += animationToString(anim);
		}

		newObject += ">";

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