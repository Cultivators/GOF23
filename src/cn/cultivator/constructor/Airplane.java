package cn.cultivator.constructor;

public class Airplane {
	private Engine engine;
	private OrbitalModule orbitalModule;
	private EascapTower tower;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public EascapTower getTower() {
		return tower;
	}
	public void setTower(EascapTower tower) {
		this.tower = tower;
	}
}

class Engine{
	private String name ;

	public Engine(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class OrbitalModule{
	
	private String name;
	

	public OrbitalModule(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class EascapTower{
	private String name;

	public EascapTower(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
