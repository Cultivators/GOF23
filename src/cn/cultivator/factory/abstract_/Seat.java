package cn.cultivator.factory.abstract_;

public interface Seat {
	void seat();
}

class LowSeat implements Seat{

	@Override
	public void seat() {
		System.out.println("µÕ∂ÀŒª÷√_≤ª Ê  ");
	}
}
class LuxurySeat implements Seat{

	@Override
	public void seat() {
		System.out.println("∏ﬂ∂ÀŒª÷√_ Ê  ");
	}
	
	
}