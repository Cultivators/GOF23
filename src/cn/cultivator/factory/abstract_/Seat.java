package cn.cultivator.factory.abstract_;

public interface Seat {
	void seat();
}

class LowSeat implements Seat{

	@Override
	public void seat() {
		System.out.println("�Ͷ�λ��_������");
	}
}
class LuxurySeat implements Seat{

	@Override
	public void seat() {
		System.out.println("�߶�λ��_����");
	}
	
	
}