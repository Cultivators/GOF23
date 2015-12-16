package cn.cultivator.factory.abstract_;

public interface Engine {
	void run();
	void rate();
}

class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("�Ͷ�����_������");
	}

	@Override
	public void rate() {
		System.out.println("�Ͷ�����_��ת��");
	}
	
}
class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("�߶�����_������");
	}

	@Override
	public void rate() {
		System.out.println("�߶�����_��ת��");
	}
	
}
