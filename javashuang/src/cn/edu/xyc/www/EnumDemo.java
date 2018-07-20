package cn.edu.xyc.www;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumTest[] a = EnumTest.values();
		for(EnumTest element:a)
			System.out.println(element);
		EnumTest b = EnumTest.valueOf("LARGE");
		System.out.println(b.toString());
		Enum<EnumTest> c = EnumTest.valueOf(EnumTest.class, "MEDIUM");
		System.out.println(c.toString());
		int t=EnumTest.EXTRA_LARGE.ordinal();
		System.out.println(t);
	}

}
