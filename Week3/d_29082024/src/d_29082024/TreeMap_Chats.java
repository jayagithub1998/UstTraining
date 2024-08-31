package d_29082024;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Chats {
	public static void main(String[] args) {
	TreeMap<String,String> hmss= new TreeMap<>(
			(o1,o2)->(o2.compareTo(o1))
			);
	hmss.put("name1", "msg1");
	hmss.put("name2", "msg2");
	hmss.put("name3", "msg3");
	hmss.put("name4", "msg4");
	hmss.put("name5", "msg5");
	
	Set<String> ks = hmss.keySet();
	for(String k:ks) {
		System.out.println(k+"->"+hmss.get(k));
	}
	}

}
