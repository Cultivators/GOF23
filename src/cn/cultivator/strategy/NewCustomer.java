package cn.cultivator.strategy;

public class NewCustomer implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("�»�Ա�����");
		return price*0.9;
	}

}
