package thread;

public class TestPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource m = new Resource(100);
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		try {Thread.sleep(5);
	}
		catch(Exception e) {}
		t2.start();
	}
}
