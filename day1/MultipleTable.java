package assignementMultipleTable;

public class MultipleTable {
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {
			System.out.println(" Multiplication table of "+i);
			System.out.println("----------------------------");
			for(int j=1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
				
			}
			System.out.println("\n");
		}
	}

}
