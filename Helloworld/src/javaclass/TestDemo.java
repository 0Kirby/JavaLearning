package javaclass;

public class TestDemo {
public static void main(String args[]){
	Address addressA=new Address();
	addressA.setCountry("中国");
	addressA.setProvince("江苏省");
	addressA.setCity("盐城市");
	addressA.setStreet("新都街道");
	addressA.setCode("224001");
	System.out.println(addressA.getInfo());
	Address addressB = new Address("china","jiangxi","yichun","gaoxin","336000");
	System.out.println(addressB.getInfo());
	}
}
