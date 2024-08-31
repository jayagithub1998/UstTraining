package d_29082024;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class ChatMsgTM{
	String receiver_name;
	String Msg;
	public ChatMsgTM(String receiver_name, String msg) {
		super();
		this.receiver_name = receiver_name;
		Msg = msg;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	@Override
	public String toString() {
		return "ChatMsgTM [receiver_name=" + receiver_name + ", Msg=" + Msg + "]";
	}
	
	
}
class Participants{
	String sender_name;
	double number;
	public Participants(String sender_name, double number) {
		super();
		this.sender_name = sender_name;
		this.number = number;
	}
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Participants [sender_name=" + sender_name + ", number=" + number + "]";
	}
	
}
public class TreeMap_ChatMsgs {
	public static void main(String[] args) {
		TreeMap<ChatMsgTM,Participants> tm = new TreeMap<>(
				(o1,o2)->(o2.getReceiver_name().compareTo(o1.getReceiver_name()))
				);
		tm.put(new ChatMsgTM("S1","msg1"), new Participants("P1",123341));
		tm.put(new ChatMsgTM("S2","msg2"), new Participants("P2",123342));
		tm.put(new ChatMsgTM("S3","msg3"), new Participants("P3",123343));
		tm.put(new ChatMsgTM("S4","msg4"), new Participants("P4",123344));
		tm.put(new ChatMsgTM("S5","msg5"), new Participants("P5",123345));
		System.out.println(tm);
		
		//keys
		Set<ChatMsgTM> ks=tm.keySet();
		System.out.println("keys"+ks);
		//key value
		for(ChatMsgTM p:ks) {
			System.out.println(p+"->"+tm.get(p));
		}
		//using entry set
		Set<Entry<ChatMsgTM,Participants>> e =tm.entrySet();
		Iterator<Entry<ChatMsgTM,Participants>> itr = e.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	
		
		
	}
}
