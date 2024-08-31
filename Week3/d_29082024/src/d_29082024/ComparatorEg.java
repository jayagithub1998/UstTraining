package d_29082024;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class ChatMsgTS{
	String participant;
	String Msg;
	public ChatMsgTS(String participant, String msg) {

		this.participant = participant;
		Msg = msg;
	}
	public String getParticipant() {
		return participant;
	}
	public void setParticipant(String participant) {
		this.participant = participant;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	@Override
	public String toString() {
		return "ChatMsgTS [participant=" + participant + ", Msg=" + Msg + "]";
	}
	
}
public class ComparatorEg {
	public static void main(String[] args) {
		
	/*	inner class
	 * class TSComparator implements Comparator<ChatMsgTS>{

			@Override
			public int compare(ChatMsgTS o1, ChatMsgTS o2) {
				return o1.getParticipant().compareTo(o2.getParticipant());
			}
			
		}
				Set<ChatMsgTS> lmsg =  new TreeSet<>(new TSComparator());
		*/
		
	/*	inner  class
	 * Comparator <ChatMsgTS> mcmp = new Comparator<ChatMsgTS>() {
			@Override
			public int compare(ChatMsgTS o1, ChatMsgTS o2) {
				return o1.getParticipant().compareTo(o2.getParticipant());
			}
			
		};
		Set<ChatMsgTS> lmsg =  new TreeSet<>(mcmp);
		*/
		/*inner annonymous class
		Set<ChatMsgTS> lmsg =  new TreeSet<>(new Comparator<ChatMsgTS>() {
			@Override
			public int compare(ChatMsgTS o1, ChatMsgTS o2) {
				return o1.getParticipant().compareTo(o2.getParticipant());
			}
			
		});
	*/
		//lambda
		Set<ChatMsgTS> lmsg =  new TreeSet<>(
		(o1,o2)->o1.getParticipant().compareTo(o2.getParticipant())
		);
	
		lmsg.add(new ChatMsgTS("P1","D"));
		lmsg.add(new ChatMsgTS("P2","E"));		
		lmsg.add(new ChatMsgTS("P2","D"));
		lmsg.add(new ChatMsgTS("P4","S"));
		System.out.println("Sorted based on ascending order of participant name");
		display(lmsg);
		
		
		System.out.println("Minimum based on ascending order of message");
		System.out.println(Collections.min(lmsg,(o1,o2)->(o1.getMsg().compareTo(o2.getMsg()))));
		System.out.println("filter -P2");	
		lmsg.stream().filter((o1)->o1.getParticipant().equals("P2")||o1.getParticipant().equals("P1"))
		.forEach((i)->{System.out.println(i);});

	}
	
static void display(Set<ChatMsgTS> clist) {
	for(ChatMsgTS i :clist) {
		System.out.println(i);
	}
	
}
}


