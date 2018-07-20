package langLearning;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char aryChar []= {'A','C','C','P'};
//		String str1 = "NEWER";
//		String str2 = new String("APTECH");
//		String str3 = new String(aryChar);
//		
//		System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);

//	    String str1 = "ACCP", str2 = "ACCP";
//	    String str3 = new String("NEWER"), str4 = new String("NEWER");
//	    if (str1 == str2) {
//	      System.out.println("str1和str2指向同一字符串"); }
//	    else {
//	      System.out.println("str1和str2分别指向不同字符串"); }
//
//	    if (str1.equals(str2)) {
//	      System.out.println("str1和str2的内容完全相同"); }
//	    else {
//	      System.out.println("str1和str2的内容不相同"); }
//
//	    if (str3 == str4) {
//	      System.out.println("str3和str4指向同一字符串"); }
//	    else {
//	      System.out.println("str3和str4分别指向不同字符串"); }
//
//	    if (str3.equals(str4)) {
//	      System.out.println("str3和str4的内容完全相同");}
//	    else {
//	      System.out.println("str3和str4的内容不相同"); }

	    String str1 = "  Java is OOP";
	    String str2 = new String("accp");
	    
	    System.out.println(str1.charAt(2));
	    System.out.println(str1.substring(5));
	    System.out.println(str1.substring(2, 9));
	    System.out.println(str1.concat(str2));
	    System.out.println(str1 + str2);
	    System.out.println(str1.replace('a', 'e'));
	    System.out.println(str1.trim());
	    System.out.println(str1.getBytes());
	    char c[]=str1.toCharArray();
	    System.out.println(c[4]);
	    
	}

}
