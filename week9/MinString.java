package assignments;

public class MinString {
	public static void main(String[] args) {
		String arr[]=new String[5];
		arr[0]="cccc";
		arr[1]="bbbb";
		arr[2]="cccc";
		arr[3]="aaaa";
		arr[4]="eeee";
		String min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(min.compareTo(arr[i])==1) {
				min=arr[i];
			}
		}
		System.out.println("Alphabetically mininum string is "+min);
		
	}


}
