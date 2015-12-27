package cn.cultivator.staticproxy;

public class RealStar implements Star{

	@Override
	public void sing() {
		System.out.println("±¾ÈËÇ××ÔÑÝ³ª");
	}

	@Override
	public void bookticket() {
		System.out.println("real_bookticket()");
	}

	@Override
	public void talk() {
		System.out.println("real_talk()");
	}

	@Override
	public void business() {
		System.out.println("real_business()");
	}

}
