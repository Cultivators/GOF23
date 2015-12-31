package cn.cultivator.templatemethod;

public class Client {
	public static void main(String[] args) {
		HotelTemplate ht = new HotelTemplate() {
			@Override
			public void transaction() {
				System.out.println("银行业务");
			}
		};
		ht.process();
	}
	
}
