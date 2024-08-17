//Use method for Fibonacci
package assignmentFibonacciMethod;

public class FibonacciMethod {

	public static void main(String[] args) {
		Fibonacci(1000);

	}
	
	public static void Fibonacci(int Max){
		int first=0;
		int second=1;
		int next=0;
		System.out.println("Fibonacci series until "+Max);
		for(int i=0;next<Max;i++) {
			System.out.println(next);
			first=second;
			second=next;
			next =first+second;
	}
	}

}
