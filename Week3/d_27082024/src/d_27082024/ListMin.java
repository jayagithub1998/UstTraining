package d_27082024;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMin {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(34,43,112,1,5454,3);
		System.out.println(Collections.min(li));
		//System.out.println(Collections.sort(li));
		Collections.sort(li);
		System.out.println(li);
		
		for(int i :li){
			System.out.println(i);
		}
	}
}
