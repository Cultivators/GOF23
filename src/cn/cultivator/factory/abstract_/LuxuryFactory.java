package cn.cultivator.factory.abstract_;

public class LuxuryFactory implements CarFactory{

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

}
