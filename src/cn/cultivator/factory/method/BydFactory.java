package cn.cultivator.factory.method;

public class BydFactory implements CarFactory{

	@Override
	public Car create() {
		return new Byd();
	}

}
