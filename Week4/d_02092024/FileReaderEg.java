package d_02092024;

import java.io.FileInputStream;

public class FileReaderEg {
	public static void main(String[] args) throws Exception {
		FileInputStream fis= new FileInputStream("./xyz.txt");
		int c;
		while((c=fis.read()) != -1) {
			System.out.print((char)c);
		}
		fis.close();
	}
}
