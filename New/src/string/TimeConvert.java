package string;

import java.util.Calendar;

public class TimeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Calendar calendar = Calendar.getInstance();
				calendar.setTimeInMillis(1530793834000L);
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH);
				int day = calendar.get(Calendar.DAY_OF_MONTH);
				int hour = calendar.get(Calendar.HOUR_OF_DAY);
				int minute = calendar.get(Calendar.MINUTE);
				int second = calendar.get(Calendar.SECOND);
				
				System.out.println(year + "��" + (month + 1) + "��" + day + "��"
						+ hour + "ʱ" + minute + "��" + second + "��");

	}

}
