package twoDArray;

public class twoDArray {
	public static void main(String[]args) {
		float pincome[][]=new float[2][3];
		pincome[0][0]=(float)5.8;
		pincome[0][1]=(float)18.2;
		pincome[0][2]=(float)5.18;
		pincome[1][0]=(float)25.8;
		pincome[1][1]=(float)16.4;
		pincome[1][2]=(float)51.8;
		print(pincome);
	
	}

	public static void print(float[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}

}
