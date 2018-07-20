package exceptionLearning;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int age = Integer.parseInt(args[0]);
			if (age < 0 || age > 100) {
				// 创建一个异常实例，并将其手工抛出
				throw (new AgeException());
			}
			System.out.println("您的年龄是：" + age + "岁。");
		} catch (Exception ae) // 捕捉异常
		{
			// 打印出异常信息
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}
}
