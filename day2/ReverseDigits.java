//Reverse digits of given int and print. For eg. 6814. Print each digits separately (Do not use string)

package assignmentReverseDigits;

public class ReverseDigits {

	public static void main(String[] args) {
		int Num=6814;
		int[] RevDigits=ReverseDigits(Num);
		DisplayDigits(RevDigits);

	}
	
	public static int[] ReverseDigits(int Num){
		int a;
		int RevDigits[]=new int[4];
		for (int i=0;Num>0;i++) {
			a=Num%10;
			Num=Num/10;
			RevDigits[i]=a;
			
		}
		return RevDigits;
	}
	
	public static void DisplayDigits(int[] array) {
		int len=array.length;
		
		System.out.println("Digits are :");
		for(int i=0;i<len;i++) {
			System.out.println(array[i]);
		}
	}

}
