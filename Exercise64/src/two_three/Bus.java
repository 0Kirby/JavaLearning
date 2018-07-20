package two_three;

public class Bus extends Car{
	
	public Bus(){
		super.wheelNum=4;
		super.capacity=50;
		super.energy="gas";
	}
	
	@Override
	public String run() {
		// TODO Auto-generated method stub
		return "公交车跑了！";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "公交车加速了！";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "公交车刹车了！";
	}

	@Override
	public String toString() {
		return "Bus [run()=" + run() + ", accelerate()=" + accelerate() + ", brake()=" + brake() + ", getBrand()="
				+ getBrand() + ", getCapacity()=" + getCapacity() + ", getWheelNum()=" + getWheelNum()
				+ ", getEnergy()=" + getEnergy() + "]";
	}
	
}
