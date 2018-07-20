package utilLearning;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("今天的日期是："+date);
		long time = date.getTime();
		System.out.println("自1970年1月1日起以毫秒为单位的时间(GMT):" + time);
		
		String strDate = date.toString();
		String strTime = strDate.substring(11, (strDate.length() - 4));
		System.out.println(strTime);
	    strTime = strTime.substring(0, 8);
	    System.out.println(strTime);

	}

}
