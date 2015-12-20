package cn.cultivator.constructor;

public class CustomAriplaneDirector implements AirplaneDirector {

	private AirplaneBuilder airplaneBuilder;
	
	public CustomAriplaneDirector(){}
	
	public CustomAriplaneDirector(AirplaneBuilder airplaneBuilder){
		this.airplaneBuilder = airplaneBuilder;
	}
	
	
	public AirplaneBuilder getAirplaneBuilder() {
		return airplaneBuilder;
	}


	public void setAirplaneBuilder(AirplaneBuilder airplaneBuilder) {
		this.airplaneBuilder = airplaneBuilder;
	}

	@Override
	public Airplane directorAirplane() {
		EascapTower et = airplaneBuilder.createEascapTower();
		Engine e = airplaneBuilder.createEngine();
		OrbitalModule om = airplaneBuilder.createOrbitalModuble();
		
		Airplane a = new Airplane();
		a.setEngine(e);
		a.setOrbitalModule(om);
		a.setTower(et);
		return a;
	}



}
