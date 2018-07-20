package exceptionLearning;

public class ThrowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.setName("уехЩ");
		try {
			std.setAge(10);
			System.out.println(std.display());
		} catch (AgeException ae) {
			// TODO Auto-generated catch block
			System.out.println(ae.getMessage());
		}	
	}

}
