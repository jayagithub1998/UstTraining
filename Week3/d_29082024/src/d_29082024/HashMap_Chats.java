package d_29082024;

import java.util.HashMap;
import java.util.Set;

/*class ChatMsg{
	String participant;
	String Msg;
	public ChatMsg(String participant, String msg) {

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
	
}*/
public class HashMap_Chats {
	public static void main(String[] args) {
		HashMap<String,String> hmss= new HashMap<>();
		hmss.put("name1", "msg1");
		hmss.put("name2", "msg2");
		hmss.put("name3", "msg3");
		hmss.put("name4", "msg4");
		hmss.put("name5", "msg5");
		
		Set<String> ks = hmss.keySet();
		for(String k:ks) {
			System.out.println(hmss.get(k));
		}
		
	}

}
