package cn.cultivator.constructor;

public class Client {
	public static void main(String[] args) {
		CustomAriplaneDirector cad = new CustomAriplaneDirector(new CustomAirplaneBuilder());
		Airplane airplane = cad.directorAirplane();
		System.out.println(airplane);
		
	}
}
