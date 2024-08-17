package assignmentFibonacci;

public class Fibonacci {
	public static void main (String args[]) {
		int first=0;
		int second=1;
		int next=0;
		System.out.println("Fibonacci series until 1000");
		for(int i=0;next<1000;i++) {
			System.out.println(next);
			first=second;
			second=next;
			next =first+second;
			
		}
		
	}

}

