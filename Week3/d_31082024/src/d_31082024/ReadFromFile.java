package d_31082024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFromFile {
	public static void main(String[] args) throws Exception {
		FileInputStream fis= new FileInputStream("./xyz.txt");
		int c;
		while((c=fis.read()) != -1) {
			System.out.print((char)c);
		}
		fis.close();
	}

}
