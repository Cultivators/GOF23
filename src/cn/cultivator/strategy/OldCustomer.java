package cn.cultivator.strategy;

public class OldCustomer implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("�ϻ�Ա�����");
		return price*0.8;
	}

}
