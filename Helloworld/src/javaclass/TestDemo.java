package javaclass;

public class TestDemo {
public static void main(String args[]){
	Address addressA=new Address();
	addressA.setCountry("�й�");
	addressA.setProvince("����ʡ");
	addressA.setCity("�γ���");
	addressA.setStreet("�¶��ֵ�");
	addressA.setCode("224001");
	System.out.println(addressA.getInfo());
	Address addressB = new Address("china","jiangxi","yichun","gaoxin","336000");
	System.out.println(addressB.getInfo());
	}
}
