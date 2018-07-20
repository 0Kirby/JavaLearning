package zuche;

public class Vehicle {

	private int number;
	private String name;
	private int money;
	
	public Vehicle() {
		super();
	}


	public Vehicle(int number, String name, int money) {
		super();
		this.number = number;
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
