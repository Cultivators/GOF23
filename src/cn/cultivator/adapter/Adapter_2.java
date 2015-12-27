package cn.cultivator.adapter;

public class Adapter_2 implements Target{

	private Adaptee adaptee;
	
	
	public Adapter_2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void handleReq() {
		adaptee.request();
	}
}
