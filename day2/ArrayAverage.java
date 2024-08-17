//Declare an array with petrol prices in 6 metro cities, calculate average petrol price and print
package assignmentArrayAvg;

public class ArrayAverage {

	public static void main(String[] args) {
		double [] prices=new double[6];
		prices[0]=100;
		prices[1]=100.98;
		prices[2]=100.24;
		prices[3]=100.7;
		prices[4]=100.985;
		prices[5]=99.98;
		Average(prices);
		

	}
	
	public static void Average(double [] array) {
		double sum=0;
		int len=array.length;
		for(int i=0;i<len;i++) {
			sum=sum+array[i];
		}
		double avg=sum/len;
		System.out.println("Average is "+avg);
	}

}
