package cn.cultivator.factory.abstract_;

public interface CarFactory {
	Tyre createTyre();
	Seat createSeat();
	Engine createEngine();
}
