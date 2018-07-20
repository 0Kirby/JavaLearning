package two_three;

public class Bicycle extends Car{
	
	public Bicycle(){
		
		super.wheelNum=2;
		super.capacity=2;
		super.energy="manpower";
	}
	
	@Override
	public String run() {
		// TODO Auto-generated method stub
		return "自行车跑了！";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "自行车加速了！";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "自行车刹车了！";
	}

	@Override
	public String toString() {
		return "Bicycle [run()=" + run() + ", accelerate()=" + accelerate() + ", brake()=" + brake() + ", getBrand()="
				+ getBrand() + ", getCapacity()=" + getCapacity() + ", getWheelNum()=" + getWheelNum()
				+ ", getEnergy()=" + getEnergy() + "]";
	}

}
