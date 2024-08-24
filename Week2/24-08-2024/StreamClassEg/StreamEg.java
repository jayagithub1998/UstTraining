package StreamClassEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamEg {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,15,6,12,20);
		//list.stream().filter((e)->e>10).forEach((e)->{System.out.println(e);});
		
		ArrayList<Integer> alist = new ArrayList<>(list);
		Optional<Integer> iresult = alist.stream().filter((e)->e>10).reduce(
				//(i1,i2)->{if(i1>i2) {return i1;}else {return i2;}}
				(i1,i2)->{return i1>i2?i1:i2;}
				);
			System.out.println(iresult.get());
	}
}
