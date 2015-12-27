package cn.cultivator.flyweight;

public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void displayChess(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight{

	private String color;

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	
	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void displayChess(Coordinate c) {
		System.out.println("������ɫ"+color+",���ӵ�λ��:"+c.getX()+"/"+c.getY());
	}
	
}
