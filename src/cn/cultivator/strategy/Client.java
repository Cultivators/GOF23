package cn.cultivator.strategy;

public class Client {
	public static void main(String[] args) {
		Strategy strategy = new NewCustomer();
		Strategy strategy2 = new OldCustomer();
		Context c = new Context(strategy);
		c.getPrice(500);
		Context c2 = new Context(strategy2);
		c2.getPrice(500);
	}
}
