package cn.cultivator.factory.abstract_;

public interface Tyre {
	void use();
}
class LowTyre implements Tyre{

	@Override
	public void use() {
		System.out.println("µÍ¶ËÂÖÌ¥");
	}
}
class LuxuryTyre implements Tyre{

	@Override
	public void use() {
		System.out.println("¸ß¶ËÂÖÌ¥");
	}
	
}