package recursionFactorial;

public class Factorial {
	public static void main (String args[]) {
		System.out.println("Factorial is "+Fact(5));
		
		//Enhanced for loop
		int [] arr= {1,2,3,4,5};
		for(int c: arr) {
			System.out.println(c);
		}
		
	}
	
	public static int Fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*(Fact(n-1));
		}

	}
	
}
