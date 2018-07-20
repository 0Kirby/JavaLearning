package traffic;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(60);
		vehicle.setColor("green");
		System.out.println(vehicle.show());
		vehicle.speedUp(10);
		System.out.println(vehicle.show());
		vehicle.speedDown(20);
		System.out.println(vehicle.show());
		
		Vehicle vehicle2 = new Vehicle(100,"red");
		System.out.println(vehicle2.show());
		vehicle.speedUp(20);
		System.out.println(vehicle2.show());
		vehicle.speedDown(10);
		System.out.println(vehicle2.show());
		
		Car car = new Car(80,"yellow",4);
		System.out.println(car.show());
		
		Truck truck = new Truck(90,"black",1500.5f);
		System.out.println(truck.show());
	}

}
