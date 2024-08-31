package d_28082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


class ChatMsg{
	String participant;
	String Msg;
	public ChatMsg(String participant, String msg) {
		super();
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
		return "ChatMsg [participant=" + participant + ", Msg=" + Msg + "]";
	}
	
}
public class ChatMessages_Linkedlist {
	public static void main(String[] args) {
		LinkedList<ChatMsg> lmsg =  new LinkedList<>();
		lmsg.add(new ChatMsg("P1","D"));
		lmsg.add(new ChatMsg("P2","E"));
		lmsg.add(new ChatMsg("P3","D"));
		lmsg.add(new ChatMsg("P4","S"));
		System.out.println("List before reversing");
		display(lmsg);
		Collections.reverse(lmsg);
		System.out.println("List after reversing");
		display(lmsg);
		
	}
	
static void display(List<ChatMsg> clist) {
	for(ChatMsg i :clist) {
		System.out.println(i);
	}
	
}
}
