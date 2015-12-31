package cn.cultivator.strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void getPrice(double price){
		System.out.println(strategy.getPrice(price));
	}
}
