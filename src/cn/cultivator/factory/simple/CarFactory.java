package cn.cultivator.factory.simple;


public class CarFactory {
	public static Car createAudi(){return new Audi();}
	public static Car createByd(){return new Byd();}
	public static Car createBmw(){return new Bmw();}
}
