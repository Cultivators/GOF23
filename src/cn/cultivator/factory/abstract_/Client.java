package cn.cultivator.factory.abstract_;

public class Client {
	public static void main(String[] args) {
		CarFactory factory = new LowFactory();
		Engine e = factory.createEngine();
		e.rate();
		e.run();
	}
}
