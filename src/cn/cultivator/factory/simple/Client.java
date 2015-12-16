
package cn.cultivator.factory.simple;


public class Client {
	public static void main(String[] args) {
		/*Car c1 = new Audi();
		Car c2 = new Byd();
		Car c3 = new Bmw();*/
		//��new ������������ȥ�� �ֹ�����ȷ
		Car c1 = CarFactory.createAudi();
		Car c2 = CarFactory.createBmw();
		Car c3 = CarFactory.createByd();
		c1.run();
		c2.run();
		c3.run();
	}
}
