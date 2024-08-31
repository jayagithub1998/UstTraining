package d_30082024;

import java.util.LinkedHashSet;

public class LHashSetEg {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("xxxxx");
		lhs.add("yyyyy");
		lhs.add("xxxxx");
		lhs.add("zzzzz");
		lhs.stream().forEach((item)->{System.out.println(item);});
	}

}
