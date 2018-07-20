package zuche;

public class Complex extends Vehicle implements People,Goods{

	private int goods;
	private int people;
	
	public Complex() {
		super();
	}
	
	public Complex(int number, String name, int money, int people, int goods) {
		super(number, name, money);
		this.goods = goods;
		this.people = people;
	}

	public int getGoods() {
		return goods;
	}

	public void setGoods(int goods) {
		this.goods = goods;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	

	
}
