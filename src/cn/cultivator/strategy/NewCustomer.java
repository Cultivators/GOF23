package cn.cultivator.strategy;

public class NewCustomer implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("新会员打九折");
		return price*0.9;
	}

}
