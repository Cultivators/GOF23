package cn.cultivator.strategy;

public class OldCustomer implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("老会员打八折");
		return price*0.8;
	}

}
