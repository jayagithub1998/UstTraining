//Recheck prime number logic with lesser number of iterations. Use Methods for prime number
package assignmentPrime;

public class Prime {

	public static void main(String[] args) {
		int Num= 23;
		IsPrime(Num);
	}
	
	public static void IsPrime(int Num) {
		boolean prime=true;
		for (int i=2;i<=Num/2;i++) {
			if(Num%i==0) {
				prime=false;
				}
		}
			if(prime==false) {
				System.out.println(Num +" is not prime");
			}
			else {
				System.out.println(Num +" is prime");
			}
	}
}
