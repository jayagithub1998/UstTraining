package assignments;

import java.util.Scanner;

public class SingletonMainAssignment {

	public static void main(String[] args) {
		int arr[] = new int[3];
		Scanner scnr = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter next value, and press enter");
			int val = scnr.nextInt();
			arr[i] = val;
		}
		
		SingletonAssignment obj = SingletonAssignment.getInstance(arr);
	//	int min_result = obj.min();
		System.out.println(obj);
		
		SingletonAssignment obj1 = SingletonAssignment.getInstance(arr);
	//	min_result = obj1.min();
		System.out.println(obj1);
		
		 SingletonAssignment obj2 = SingletonAssignment.getInstance(arr);
	//	 min_result = obj1.min();
			System.out.println(obj2);
			
		 SingletonAssignment obj3 = SingletonAssignment.getInstance(arr);
	//	 min_result = obj1.min();
			System.out.println(obj3);
			
		 SingletonAssignment obj4 = SingletonAssignment.getInstance(arr);
	//	 min_result = obj1.min();
		System.out.println(obj4);
		
		 SingletonAssignment obj5 = SingletonAssignment.getInstance(arr);
	//	 min_result = obj1.min();
		System.out.println(obj5);
		
		 SingletonAssignment obj6 = SingletonAssignment.getInstance(arr);
	//	 min_result = obj1.min();
		System.out.println(obj6);
		
		 SingletonAssignment obj7 = SingletonAssignment.getInstance(arr);
	//	 min_result = obj1.min();
		System.out.println(obj7);
		
		 SingletonAssignment obj8 = SingletonAssignment.getInstance(arr);
	//	 min_result = obj1.min();
		System.out.println(obj8);
	}


}
