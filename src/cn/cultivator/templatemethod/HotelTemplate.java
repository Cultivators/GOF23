package cn.cultivator.templatemethod;

public abstract class HotelTemplate {
	
	public void takeNumber(){
		System.out.println("取号");
	}
	public abstract void transaction();
	
	public void evaluate(){
		System.out.println("评分");
	}
	public final void process(){
		this.takeNumber();//固定的
		this.transaction();//可变的
		this.evaluate();//固定的
	}
}

