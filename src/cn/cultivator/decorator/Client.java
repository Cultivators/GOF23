package cn.cultivator.decorator;

/**
 * 最外层开始包装
 * @author Hickey
 *
 */
public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("----------增加功能-----------");
		FlyCar fc = new FlyCar(car);
		fc.move();
		System.out.println("----------增加功能-----------");
		WaterCar wc = new WaterCar(fc);
		wc.move();
		System.out.println("----------增加功能-----------");
		WaterCar wc1 = new WaterCar(new FlyCar(new WaterCar(new Car())));
		wc1.move();
	}
}
