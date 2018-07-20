package saigo;

import java.util.Calendar;
import java.util.Date;

public class StringTest {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//空字符串
		String s=new String();
		System.out.println(s);
		
		//非空字符串
		String s2=new String("student");
		System.out.println(s2);
		
		//用字符数组创建字符串
		char ch[]={'s','t','u','d','e','n','t',};
		String s3=new String(ch);
		System.out.println(s3);
		
		int length=s3.length();
		System.out.println(length);
		
		//System.out.print((int)'a');
		
		for(int i=0;i<length;i++){
		//System.out.print((char)97);
			System.out.print((char)(ch[i]-32));
		}
		System.out.print("\n");
		System.out.println(s3.toUpperCase());
		
		String s4="STUDENTS";
		System.out.println(s4.toLowerCase());
		
		//判断两个字符串内容是否相等（忽略大小写）
		if(s3.equalsIgnoreCase(s4)){
			System.out.println("s3 same as s4");
		}
		//判断两个字符串内容是否相等
		if(s3.equals("admin")){
			System.out.println("welcome");
		}
		else
			System.out.println("please log in again");
		
		//ASCII码比较字符串
		System.out.println(s3.compareTo(s4));
			
		//判断当前字符串是否S为开头
		if(s3.startsWith("S")){
			System.out.println(s3);
		}
		
		//STUDENT字符串的首次出现S的位置
		System.out.println(s4.indexOf("S"));
		
		System.out.println(s4.lastIndexOf("S"));
		
		
		//charAt(int index)从指定位置提取单个字符
		
		System.out.println(s4.charAt(6));
		
		//求子串
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(2,4));
		
		//替换字符串
		System.out.println(s3.replace("en", "an"));
		
		//连接字符串
		
		System.out.println(s3.concat("s"));
		
		Date date=new Date();
		System.out.println(date);
		
		//把对象转为字符串
		String sdate=date.toString();
		
		String subsdate=sdate.substring(11,13);
		if(Integer.parseInt(subsdate)>=18){
			System.out.println("good evening");
		}
		else
			System.out.println("good day");
		
		Date sixteen=new Date("Tue May 22 18:00:00 CST 2018");
		System.out.println(date.getHours());
		if(date.after(sixteen)){
			System.out.println("good evening");
		}
		
		
		//获取日历类的实例
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.HOUR));
		
		if(cal.get(Calendar.HOUR)>=6){
			System.out.println("good evening");
		}
		System.out.println(cal.get(Calendar.YEAR));
		
		
		//求闰年
		if(cal.get(Calendar.YEAR)%4==0&&cal.get(Calendar.YEAR)%100!=0||
				
				cal.get(Calendar.YEAR)%400==0){
			System.out.println("leap year");
			
		}
		
		
	}
}
