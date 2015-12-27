package cn.cultivator.bridge;

public class Client {
	public static void main(String[] args) {
		Computer c = new Destop(new Dell());
		c.sale();
	}
}
