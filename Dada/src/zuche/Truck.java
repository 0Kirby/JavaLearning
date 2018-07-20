package zuche;

public class Truck extends Vehicle implements Goods{

	private int goods;

	public Truck() {
		super();
	}

	public Truck(int number, String name, int money, int goods) {
		super(number, name, money);
		this.goods = goods;
	}

	public int getGoods() {
		return goods;
	}

	public void setGoods(int goods) {
		this.goods = goods;
	}
	
}
