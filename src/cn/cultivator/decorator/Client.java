package cn.cultivator.decorator;

/**
 * ����㿪ʼ��װ
 * @author Hickey
 *
 */
public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("----------���ӹ���-----------");
		FlyCar fc = new FlyCar(car);
		fc.move();
		System.out.println("----------���ӹ���-----------");
		WaterCar wc = new WaterCar(fc);
		wc.move();
		System.out.println("----------���ӹ���-----------");
		WaterCar wc1 = new WaterCar(new FlyCar(new WaterCar(new Car())));
		wc1.move();
	}
}
