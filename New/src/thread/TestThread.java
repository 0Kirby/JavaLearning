package thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource m = new Resource(100);
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		t1.start();
		t2.start();
	}

}
