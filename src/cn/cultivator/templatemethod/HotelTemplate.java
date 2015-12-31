package cn.cultivator.templatemethod;

public abstract class HotelTemplate {
	
	public void takeNumber(){
		System.out.println("ȡ��");
	}
	public abstract void transaction();
	
	public void evaluate(){
		System.out.println("����");
	}
	public final void process(){
		this.takeNumber();//�̶���
		this.transaction();//�ɱ��
		this.evaluate();//�̶���
	}
}

