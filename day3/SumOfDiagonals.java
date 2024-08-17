/*In 2D array, of size 4*4, develop a program, to sum up all elements of both the diagonals*/
package assignmentSumOfDiagonals;

public class SumOfDiagonals {

	public static void main(String[] args) {
		int[][] array=new int[4][4];
		array[0][0]=1;
		array[0][1]=2;
		array[0][2]=2;
		array[0][3]=1;
		array[1][0]=2;
		array[1][1]=1;
		array[1][2]=1;
		array[1][3]=2;
		array[2][0]=2;
		array[2][1]=1;
		array[2][2]=1;
		array[2][3]=2;
		array[3][0]=1;
		array[3][1]=2;
		array[3][2]=2;
		array[3][3]=1;
		System.out.println("Array is");
		print(array);
		sumDiagonals(array);
		

	}
	public static void sumDiagonals(int[][]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i==j || i+j==3) {
					sum=sum+a[i][j];
				}
				
			}
		}
		System.out.println("Sum of diagonals is "+sum);
	}
	public static void print(int[][] a) {
		int len=a.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
