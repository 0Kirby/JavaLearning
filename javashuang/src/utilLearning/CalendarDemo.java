package utilLearning;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.print("��ǰϵͳʱ��");
		System.out.print(cal.get(Calendar.YEAR) + "��");
	    System.out.print((cal.get(Calendar.MONTH) + 1) + "��");
	    System.out.print(cal.get(Calendar.DATE) + "�� ");
	    System.out.print(cal.get(Calendar.HOUR_OF_DAY) + ":");//24Сʱ�ƣ�12Сʱ��Calendar.HOUR
	    System.out.print(cal.get(Calendar.MINUTE) + ":");
	    System.out.println(cal.get(Calendar.SECOND));
	    cal.add(Calendar.MINUTE, 30);
	    Date date = cal.getTime();
	    System.out.println("����ǰʱ�����30���Ӻ��ʱ�䣺" +date);

	}

}
