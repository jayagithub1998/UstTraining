package d_30082024;

public class ExceptionHandling {
	public static void main(String[] args) {
	//	String str="34";
		try {
		String str="asdff";
		int val=Integer.parseInt(str);
		val*=1.1;
		System.out.println(val);
		}
		catch(Exception e) {
			System.out.println("Error");
		//	e.printStackTrace();
		}
	}
}
