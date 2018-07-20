package test.car;

public class Car extends Vehicles{

	private int seats;
	
	public void showCar(){
		System.out.println("brand:"+getBrand()+",color:"+getColor()+",seats="+getSeats());
	}

	public Car(String brand, String color, int seats) {
		super(brand,color);
		this.seats = seats;
	}

	public Car() {
		
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}
