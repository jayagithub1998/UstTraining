package d_31082024;

import ExceptionEg2.ExceptionEg2;

public class ExceptionEg {
	public static void main(String[] args) {
		//java.lang.StackOverflowError
		//main(args);
		
		try {
			ExceptionEg2.met1();
			ExceptionEg1.met();
		
			//java.lang.NumberFormatException
		/*	String str1="asdff";
			int val=Integer.parseInt(str1);
			*/
			
		//java.lang.ArrayIndexOutOfBoundsException
		  int a[]= {1,2,3,4,5}; for(int i=0;i<=a.length;i++) {
		  System.out.println(a[i]); }
		
		
		
		//java.lang.StringIndexOutOfBoundsException
		String str="abcd";
		String subStr=str.substring(2,9);
		ExceptionEg2.met1();
		ExceptionEg1.met();
		
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("String Index Out Of Bounds Exception "+se);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Index Out Of Bounds Exception "+ae);
		}
		catch(NumberFormatException ne) {
			System.out.println("Number Format Exception "+ne);
		}
		catch(StackOverflowError soe) {
			System.out.println("Stack Overflow exception "+soe);
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
