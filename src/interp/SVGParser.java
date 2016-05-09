package interp;

/** Class that implements the interpreter of the language. */

public class SVGParser {

	private String filename;

	private String SVG;

	/** Mapa amb les variables de tipus objecte tractats actualment */
	private HashMap<String, List<Data> > SVGObjects;
	
	public SVGParser(String filename) {
		this.filename = filename;
		SVGObjects = HashMap<String, List<Data> >();
	}

	public void createObject(String id, Data data) {
		List<Data> dades = SVGObjects.get(id);
      	List<Data> newDades = new List<Data>();
       	newDades.add(data);
        if (dades == null) {
        	SVGObjects.put(id, newDades); 
		} else {
        	writeObjectToSVGFile(dades);
        	SVGObjects.setData(newDades);
        } 
	}

	public void addAnimation(String idObject, String idAnimation, Data animation) {
		
	}

	/** Neteja les variables de tipus objecte tractats actualment */
	public void clearObjects() {
		for (Map.Entry<String, List<Data> > entry : SVGObjects.entrySet()) {
    		String key = entry.getKey();
	    	List<Data> dades = entry.getValue();
	    	writeObjectToSVGFile(key, dades);
		}
		SVGObjects.clear();
	}

	public void writeObjectToSVGFile(String id, List<Data> dades) {
	}

	public void writeSVGFile() {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(filename+".svg"), "utf-8"))) {
   		writer.write(SVG);
	}
}