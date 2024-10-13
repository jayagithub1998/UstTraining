package assignments;
import java.util.Scanner;


public class SingletonEg {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner scnr = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter next value, and press enter");
			int val = scnr.nextInt();
			arr[i] = val;
		}
		
		/*
		SingletonClass obj = SingletonClass.getInstance(arr);
		int min_result = obj.min();
		
		SingletonClass obj1 = SingletonClass.getInstance(arr);
		
	
		 min_result = obj1.min();
		
		SingletonClass obj2 = SingletonClass.getInstance(arr);
		System.out.println(min_result);
		*/
		SingletonClass2 obj = SingletonClass2.getInstance(arr);
		int min_result = obj.min();
	System.out.println(obj);
		SingletonClass2 obj1 = SingletonClass2.getInstance(arr);
		System.out.println(obj1);
	
		 min_result = obj1.min();
	
		SingletonClass2 obj2 = SingletonClass2.getInstance(arr);
		System.out.println(obj2);
		System.out.println(min_result);
	}


}
