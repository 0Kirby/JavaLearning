package time;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime time = new MyTime();
		time.setHour(9);
		time.setMinute(30);
		time.setSecond(20);
		System.out.println(time.diaplay());
		time.addHour(1);
		time.addMinute(10);
		time.addSecond(10);
		System.out.println(time.diaplay());
		time.subHour(1);
		time.subMinute(10);
		time.subSecond(10);
		System.out.println(time.diaplay());
		
		MyTime time2 = new MyTime(10,20,30);
		System.out.println(time2.diaplay());
		time2.addHour(2);
		time2.addMinute(20);
		time2.addSecond(20);
		System.out.println(time2.diaplay());
		time2.subHour(2);
		time2.subMinute(20);
		time2.subSecond(20);
		System.out.println(time2.diaplay());
		
	}

}
