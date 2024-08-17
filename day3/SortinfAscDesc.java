/* Make required changes in array sorting program, to add one more boolean parameter to sort()
 method. This boolean parameter can be used to specify, whether array need to be sorted in ascending
  or descending order */

package assignmentSortingAscDesc;

import java.util.Scanner;

public class SortinfAscDesc {

	public static void main(String[] args) {
		int [] array= {5,4,2,6,47,8,34};
		System.out.println("Array before sorting");
		print(array);
		Scanner scnr=new Scanner(System.in);
		System.out.println("Specify sorting order, true -> for Ascending and false -> for Descending");
		boolean sort=scnr.nextBoolean();
		int[] sortedArray=sortingAscDesc(array,sort);
		System.out.println(sort?"Array in Ascending order":"Array in Decending order");	
		print(sortedArray);
		scnr.close();
	

	}
/*	
 	public static int[] sorting(int[]array) {
		int len=array.length;
		int temp=0;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}
		return array;
	} 
	*/
	public static int[] sortingAscDesc(int[]array,boolean AscSort) {
		int len=array.length;
		int temp=0;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(array[j]>array[j+1] && AscSort==true) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
				if(array[j]<array[j+1] && AscSort==false) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}
		return array;
	}
	public static void print(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
	}

}
