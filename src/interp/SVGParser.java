package interp;

/** Class that implements the interpreter of the language. */

public class SVGParser {

	File SVGFile;
	
	public SVGParser(String filename) {
		
	}

	public void createObject(String id, Data data) {

	}

	public void addAnimation(String idObject, String idAnimation, Data animation) {
		
	}

	public void writeSVGFile() {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream("filename.txt"), "utf-8"))) {
   		writer.write("something");
	}
}