package cn.cultivator.staticproxy;

public class ProxyStar implements Star{

	private RealStar realStar;
	
	public ProxyStar(RealStar realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public void sing() {
		realStar.sing();
	}

	@Override
	public void bookticket() {
		System.out.println("proxy_bookticket()");
	}

	@Override
	public void talk() {
		System.out.println("proxy_talk()");
	}

	@Override
	public void business() {
		System.out.println("proxy_business()");
	}
	

}
