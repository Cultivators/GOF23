package cn.cultivator.chainOfResp;

public class Client {
	public static void main(String[] args) {
		Leader a = new Director("张三");
		Leader b = new Manager("李四");
		Leader c = new GeneralManager("王五");
		
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest lr1 = new LeaveRequest("Hickey", 20, "我想回家");
		a.handleRequest(lr1);
		
		
	}
}
