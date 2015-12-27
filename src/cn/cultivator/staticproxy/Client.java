package cn.cultivator.staticproxy;

public class Client {
	public static void main(String[] args) {
		Star proxy = new ProxyStar(new RealStar());
		proxy.sing();
		proxy.bookticket();
		proxy.business();
	}
}
