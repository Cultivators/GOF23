package cn.cultivator.factory.abstract_;

public interface Engine {
	void run();
	void rate();
}

class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("低端引擎_启动了");
	}

	@Override
	public void rate() {
		System.out.println("低端引擎_旋转了");
	}
	
}
class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("高端引擎_启动了");
	}

	@Override
	public void rate() {
		System.out.println("高端引擎_旋转了");
	}
	
}
