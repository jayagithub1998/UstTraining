package arrayExample;

public class Array {
	public static void main(String args[]) {
		int pincome[]=new int[5];
		pincome[0]=10;
		pincome[1]=20;
		pincome[2]=30;
		pincome[3]=40;
		pincome[4]=50;
		for (int i=0;i<pincome.length;i++) {
			System.out.println("Array values from beginning to end"+i+" "+pincome[i]);
		}
		for (int i=pincome.length-1;i>=0;i--) {
			System.out.println("Array values from end to beginning"+i+" "+pincome[i]);
		}
	
		
	//Max values
		int max_pincome=pincome[0];
		for (int j=0;j<pincome.length;j++) {
			if(max_pincome<pincome[j]) {
					max_pincome=pincome[j];
				}
		}
		System.out.println("Max "+max_pincome);		
				
//Min value -calling method				
		int mini_pincome=minincome(pincome);
		System.out.println("Min "+mini_pincome);
		System.out.println("\n");
		
		System.out.println("---Array---");
		print(pincome);
		System.out.println("\n");
		int [] rev_array=reverse(pincome);
		System.out.println("---Reversed array---");
		print(rev_array);
		System.out.println("\n");

	
//Reverse array -calling method				
		int [] rev_array_old=reverse(pincome);
		for(int i=0;i<=rev_array_old.length-1;i++) {
			System.out.println("Rev array "+i+" "+rev_array_old[i]);
		}
		
		
		}
	
//Min value method
	static int minincome(int[]avalues) {
		int min_pincome=avalues[0];
		for (int i=0;i<avalues.length;i++) {
			if(min_pincome>avalues[i]) {
				min_pincome=avalues[i];
			}
		}
			
			return min_pincome;
	}

	//Reverse array
	static int[] reverse(int[] avalues) {
		int n=avalues.length,temp;
		for(int i=0;i<n/2;i++) {
			temp=avalues[i];
			avalues[i]=avalues[n-i-1];
			avalues[n-i-1]=temp;
		}
		return avalues;
	}

	 static void print(int[] avalues) {
		 int n=avalues.length;
		 for (int i=0;i<n;i++) {
			 System.out.println("Array values "+avalues[i]);
		 }
	 }
}
