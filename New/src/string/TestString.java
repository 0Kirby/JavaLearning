package string;

public class TestString {


	public static void main(String args[]) {
		String s = "b";
		Change a = new Change();
		String b =a.row(s);
		System.out.println(b);
		String c = "ABCD";
		String d= c.toLowerCase();
		String e = d.replace("a", "d");
		System.out.println(e);
		StringBuffer sb = new StringBuffer("ADcF");
		sb.append("      ");
		sb.append(c);
		System.out.println(sb);
		
	}
	
}
