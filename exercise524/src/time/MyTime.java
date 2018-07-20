package time;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime() {
	}
	
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void addSecond(int sec){
		this.second += sec;
	}
	
	public void addMinute(int min){
		this.minute += min;
	}
	
	public void addHour(int hour){
		 this.hour += hour;
	}
	
	public void subSecond(int sec){
		this.second -= sec;
	}
	
	public void subMinute(int min){
		this.minute -= min;
	}
	
	public void subHour(int hour){
		this.hour -= hour;
	}

	public String diaplay() {
		return "MyTime [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
}