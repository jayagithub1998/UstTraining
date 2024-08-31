package d_28082024;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ChatMessagesTS {
	public static void main(String[] args) {
		TreeSet<String> cmsgs = new TreeSet<>(new RComparator());
		cmsgs.add("P13 - D");
		cmsgs.add("P2 - S");
		cmsgs.add("P9 - d");
		cmsgs.add("P8 - N");
		cmsgs.add("P13 - e");
		cmsgs.add("P5 - Y");
		cmsgs.add("P8 - I");
		cmsgs.add("P9 - completed");
		
		display(cmsgs);


	}
	static void display(TreeSet<String> clist) {
		for(String i :clist) {
			System.out.println(i);
		}
	}

}

class RComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
