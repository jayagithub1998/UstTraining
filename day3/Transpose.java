package assignmentTranspose;

public class Transpose {
	public static void main(String[] args) {
		int[][] array=new int[4][4];
		array[0][0]=1;
		array[0][1]=2;
		array[0][2]=3;
		array[0][3]=4;
		array[1][0]=5;
		array[1][1]=6;
		array[1][2]=7;
		array[1][3]=8;
		array[2][0]=9;
		array[2][1]=10;
		array[2][2]=11;
		array[2][3]=12;
		array[3][0]=13;
		array[3][1]=14;
		array[3][2]=15;
		array[3][3]=16;
		System.out.println("Array is");
		print(array);
		System.out.println("Transpose of array is");
		int[][]arrayTranspose=Transpose(array);
		print(arrayTranspose);
		

	}
	public static int[][] Transpose(int[][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a[0].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
				}
			}
		return a;
	}
	
	public static void print(int[][] a) {
		int len=a.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
