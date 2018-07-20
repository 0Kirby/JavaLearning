package test.car;

public class Truck extends Vehicles{

	private float load;
	
	public void showTruck(){
		System.out.println("brand:"+getBrand()+",color:"+getColor()+",load="+getLoad());
	}

	public Truck(String brand, String color, float load) {
		super(brand,color);
		this.load = load;
	}

	public Truck() {
		
	}

	public float getLoad() {
		return load;
	}

	public void setLoad(float load) {
		this.load = load;
	}

}
