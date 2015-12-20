package cn.cultivator.constructor;

public class CustomAirplaneBuilder implements AirplaneBuilder{

	@Override
	public Engine createEngine() {
		System.out.println("开始建造引擎");
		return new Engine("建造引擎....");
	}

	@Override
	public OrbitalModule createOrbitalModuble() {
		System.out.println("开始建造机舱");
		return new OrbitalModule("建造机舱....");
	}

	@Override
	public EascapTower createEascapTower() {
		System.out.println("开始建造逃逸塔");
		return new EascapTower("建造逃逸塔....");
	}
	
}
