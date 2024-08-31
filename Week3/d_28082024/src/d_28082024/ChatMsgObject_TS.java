package d_28082024;

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
public class ChatMsgObject_TS {
	public static void main(String[] args) {
		Set<ChatMsgTS> lmsg =  new TreeSet<>(new RComparatorTS());
		lmsg.add(new ChatMsgTS("P1","D"));
		lmsg.add(new ChatMsgTS("P2","E"));
		lmsg.add(new ChatMsgTS("P3","D"));
		lmsg.add(new ChatMsgTS("P4","S"));
		System.out.println("Sorted based on ascending order of participant name");
		display(lmsg);
		
	}
	
static void display(Set<ChatMsgTS> clist) {
	for(ChatMsgTS i :clist) {
		System.out.println(i);
	}
	
}
}
class RComparatorTS implements Comparator<ChatMsgTS>{

	@Override
	public int compare(ChatMsgTS o1, ChatMsgTS o2) {
		// TODO Auto-generated method stub
		return o1.getParticipant().compareTo(o2.getParticipant());
	}

	
}
