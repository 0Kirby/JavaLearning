package cn.edu.xyc.www;

public enum EnumTest {
 SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	
	private String s;
	
	private EnumTest(String s) {
		this.s=s;
	}
	public String Get() {
		return s;}
}
