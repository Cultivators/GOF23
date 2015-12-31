package cn.cultivator.state;

public interface State {
	void handle();
}

class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("����״̬");
	}
	
}

class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("Ԥ��״̬");
	}
	
}
class ChekedInState implements State{
	@Override
	public void handle() {
		System.out.println("��ס״̬");
	}
	
}
