package cn.cultivator.decorator;

public class SuperCar extends Car{
	protected ICar car;
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	@Override
	public void move() {
		car.move();
	}
}
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	public void fly(){
		System.out.println("天上飞");
	}
	@Override
	public void move() {
		super.move();
		fly();
	}
}
class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
	}
	public void water(){
		System.out.println("洒着水");
	}
	@Override
	public void move() {
		super.move();
		water();
	}
}
