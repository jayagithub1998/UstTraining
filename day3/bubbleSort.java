package bubbleSort;

public class bubbleSort {
 public static void main(String args[]) {
	 
	 int pincome[]= {82,52,-2,31,26,11};
	 int [] result=sort(pincome);
	 print(result);
	  }
 
 static int[] sort(int[] avalues) {
	 for(int i=0;i<avalues.length;i++) {
		 for(int j=0;j<avalues.length-i-1;j++) {
			 if(avalues[j]<avalues[j+1]) {
				 int temp=avalues[j];
				 avalues[j]=avalues[j+1];
				 avalues[j+1]=temp;
			 }
		 }
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
