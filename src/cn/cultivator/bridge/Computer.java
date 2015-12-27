package cn.cultivator.bridge;

public class Computer {
	protected Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	public void sale(){
		brand.sale();
	}
	
}
class Destop extends Computer{

	public Destop(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}
class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
}
