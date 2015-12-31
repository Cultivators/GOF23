package cn.cultivator.state;

public class Context {
	
	private State state;
	
	public void setState(State state){
		System.out.println("ÐÞ¸Ä×´Ì¬");
		state.handle();
	}
}
