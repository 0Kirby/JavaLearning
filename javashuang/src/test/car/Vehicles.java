package test.car;

/**
 * ����һ����ΪVehicles����ͨ���ߣ��Ļ��࣬������Ӧ����String���͵ĳ�Ա����brand���̱꣩
 * ��color����ɫ������Ӧ������Ա����run����ʻ���ڿ���̨��ʾ�����Ѿ������ˡ�����showInfo����ʾ��Ϣ��
 * �ڿ���̨��ʾ�̱����ɫ��������д���췽����ʼ�����Ա���ԡ���дCar��С��������̳���Vehicles�࣬����int�ͳ�Ա����seats
 * ����λ������Ӧ���ӳ�Ա����showCar���ڿ���̨��ʾС��������Ϣ��������д���췽������дTruck����������̳���Vehicles�࣬����float��
 * ��Ա����load���أ�����Ӧ���ӳ�Ա����showTruck���ڿ���̨��ʾ��������Ϣ��������д���췽���� ��main�����в������ϸ��ࡣ
 * 
 * @author ������
 * @version 1.0
 * 
 */
public class Vehicles {

	private String brand;
	private String color;

	public void run() {
		System.out.println("���Ѿ�������");
	}

	public void showInfo() {
		System.out.println("brand:" + getBrand() + ",color:" + color);
	}

	public Vehicles(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public Vehicles() {

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
