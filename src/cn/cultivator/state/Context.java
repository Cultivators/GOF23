package cn.cultivator.state;

public class Context {
	
	private State state;
	
	public void setState(State state){
		System.out.println("�޸�״̬");
		state.handle();
	}
}
