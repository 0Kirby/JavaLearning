package zuche;

public class Coach extends Vehicle implements People{

	private int people;

	public Coach() {
		super();
	}

	public Coach(int number, String name, int money, int people) {
		super(number, name, money);
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	
}
