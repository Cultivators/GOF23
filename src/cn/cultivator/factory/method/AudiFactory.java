package cn.cultivator.factory.method;

public class AudiFactory implements CarFactory{

	@Override
	public Car create() {
		return new Audi();
	}

}
