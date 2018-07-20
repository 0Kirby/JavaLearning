package exceptionLearning;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int age = Integer.parseInt(args[0]);
			if (age < 0 || age > 100) {
				// ����һ���쳣ʵ�����������ֹ��׳�
				throw (new AgeException());
			}
			System.out.println("���������ǣ�" + age + "�ꡣ");
		} catch (Exception ae) // ��׽�쳣
		{
			// ��ӡ���쳣��Ϣ
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}
}
