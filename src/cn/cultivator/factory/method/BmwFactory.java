package cn.cultivator.factory.method;

public class BmwFactory implements CarFactory{

	@Override
	public Car create() {
		return new Bmw();
	}

}
