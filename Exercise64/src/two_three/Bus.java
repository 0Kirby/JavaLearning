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
		return "���������ˣ�";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "�����������ˣ�";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "������ɲ���ˣ�";
	}

	@Override
	public String toString() {
		return "Bus [run()=" + run() + ", accelerate()=" + accelerate() + ", brake()=" + brake() + ", getBrand()="
				+ getBrand() + ", getCapacity()=" + getCapacity() + ", getWheelNum()=" + getWheelNum()
				+ ", getEnergy()=" + getEnergy() + "]";
	}
	
}
