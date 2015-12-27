package cn.cultivator.bridge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand{
	@Override
	public void sale() {
		System.out.println("销售lenovo");
	}
}
class Dell implements Brand{
	@Override
	public void sale() {
		System.out.println("销售dell");
	}
	
}