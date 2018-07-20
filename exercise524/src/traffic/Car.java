package traffic;

public class Car extends Vehicle {
	private int seats;

	public Car() {
		super();
	}

	public Car(int speed, String color,int seats) {
		super(speed,color);
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String move(){
		return "С������ʼ�ƶ��ˣ�";
	}
	
	@Override
	public String show() {
		return "Car [move()=" + move() + ", getSpeed()=" + getSpeed() + ", getColor()=" + getColor() + ", seats="
				+ seats + "]";
	}
	
}
