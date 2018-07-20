package utilLearning;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.print("当前系统时间");
		System.out.print(cal.get(Calendar.YEAR) + "年");
	    System.out.print((cal.get(Calendar.MONTH) + 1) + "月");
	    System.out.print(cal.get(Calendar.DATE) + "日 ");
	    System.out.print(cal.get(Calendar.HOUR_OF_DAY) + ":");//24小时制，12小时用Calendar.HOUR
	    System.out.print(cal.get(Calendar.MINUTE) + ":");
	    System.out.println(cal.get(Calendar.SECOND));
	    cal.add(Calendar.MINUTE, 30);
	    Date date = cal.getTime();
	    System.out.println("将当前时间添加30分钟后的时间：" +date);

	}

}
