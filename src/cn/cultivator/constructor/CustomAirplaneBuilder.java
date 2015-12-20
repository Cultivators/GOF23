package cn.cultivator.constructor;

public class CustomAirplaneBuilder implements AirplaneBuilder{

	@Override
	public Engine createEngine() {
		System.out.println("��ʼ��������");
		return new Engine("��������....");
	}

	@Override
	public OrbitalModule createOrbitalModuble() {
		System.out.println("��ʼ�������");
		return new OrbitalModule("�������....");
	}

	@Override
	public EascapTower createEascapTower() {
		System.out.println("��ʼ����������");
		return new EascapTower("����������....");
	}
	
}
