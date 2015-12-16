package cn.cultivator.factory.abstract_;

public class LowFactory implements CarFactory {

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}


}
