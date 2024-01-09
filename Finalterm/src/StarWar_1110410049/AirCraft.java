package StarWar_1110410049;

public class AirCraft {
	String Manufacturer;
	String Model;
	double Length;
	double AirSpeed;
	String SpaceSpeed;
	String StdandardEngine;
	String HyperSpaceEngine;
	String[] Weapon;
	double Weapon_power;
	
	public AirCraft(String Manufacturer,String Model,double Length,double AirSpeed,
							String SpaceSpeed,String StdandardEngine,String HyperSpaceEngine,String[] Weapon,double Weapon_power){
		this.Manufacturer=Manufacturer;
		this.Model=Model;
		this.Length=Length;
		this.AirSpeed=AirSpeed;
		this.SpaceSpeed=SpaceSpeed;
		this.StdandardEngine=StdandardEngine;
		this.HyperSpaceEngine=HyperSpaceEngine;
		this.Weapon=Weapon;
		this.Weapon_power=Weapon_power;
	}
	
	
	
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getAirSpeed() {
		return AirSpeed;
	}
	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}
	public String getStdandardEngine() {
		return StdandardEngine;
	}
	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public String[] getWeapon() {
		return Weapon;
	}
	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}
	public double getWeapon_power() {
		return Weapon_power;
	}
	public void setWeapon_power(double weapon_power) {
		Weapon_power = weapon_power;
	}

}
