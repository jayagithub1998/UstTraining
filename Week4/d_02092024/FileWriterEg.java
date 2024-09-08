package d_02092024;

import java.io.FileWriter;

	public class FileWriterEg {
		public static void main(String[] args) throws Exception {
			//FileWriter is character based
			FileWriter fos = new FileWriter("./xyz.txt",true); //true is append mode
			String msg="Hello, how are you?";
			fos.write(msg);
			fos.close();
		}

}
