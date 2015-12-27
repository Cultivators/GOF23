package cn.cultivator.chainOfResp;

public class Client {
	public static void main(String[] args) {
		Leader a = new Director("����");
		Leader b = new Manager("����");
		Leader c = new GeneralManager("����");
		
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest lr1 = new LeaveRequest("Hickey", 20, "����ؼ�");
		a.handleRequest(lr1);
		
		
	}
}
