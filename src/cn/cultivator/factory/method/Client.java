package cn.cultivator.factory.method;

public class Client {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().create();
		Car c2 = new BmwFactory().create();
		Car c3 = new BydFactory().create();
		c1.run();
		c2.run();
		c3.run();
	}
}
