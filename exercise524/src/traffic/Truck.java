package traffic;

public class Truck extends Vehicle{
	private float load;

	public Truck() {
		super();
	}

	public Truck(int speed, String color,float load) {
		super(speed,color);
		this.load = load;
	}

	public float getLoad() {
		return load;
	}

	public void setLoad(float load) {
		this.load = load;
	}
	
	@Override
	public String move(){
		return "卡车开始移动了！";
	}
	
	@Override
	public String show() {
		return "Truck [move()=" + move() + ", getSpeed()=" + getSpeed() + ", getColor()=" + getColor() + ", load="
				+ load + "]";
	}
}
