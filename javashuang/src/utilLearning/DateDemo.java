package utilLearning;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("����������ǣ�"+date);
		long time = date.getTime();
		System.out.println("��1970��1��1�����Ժ���Ϊ��λ��ʱ��(GMT):" + time);
		
		String strDate = date.toString();
		String strTime = strDate.substring(11, (strDate.length() - 4));
		System.out.println(strTime);
	    strTime = strTime.substring(0, 8);
	    System.out.println(strTime);

	}

}
