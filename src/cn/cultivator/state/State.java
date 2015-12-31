package cn.cultivator.state;

public interface State {
	void handle();
}

class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("¿ÕÏÐ×´Ì¬");
	}
	
}

class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("Ô¤¶¨×´Ì¬");
	}
	
}
class ChekedInState implements State{
	@Override
	public void handle() {
		System.out.println("Èë×¡×´Ì¬");
	}
	
}
