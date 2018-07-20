package thread;

public class DaemonThread {
	public static void main(String[] args) {
	       Daemon d = new Daemon();
	       Thread t = new Thread(d, "DaemonThread");

	       t.setDaemon(true);

	       t.start();

	       for (int i = 0; i < 10; i++) {
	           System.out.println(Thread.currentThread().getName() + " : " + i);
	       }
	 }
}
