package cn.cultivator.flyweight;

public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("��ɫ");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("��ɫ");
		System.out.println(chess1);
		System.out.println(chess2);
		chess1.displayChess(new Coordinate(10, 29));
		chess2.displayChess(new Coordinate(33, 45));
	}
}
