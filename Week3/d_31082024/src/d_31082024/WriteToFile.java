package d_31082024;

import java.io.FileOutputStream;

public class WriteToFile {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("./xyz.txt");
		String msg="Hello, how are yoy?";
		byte[] arr = msg.getBytes();
		fos.write(arr);
		fos.close();
	}

}
