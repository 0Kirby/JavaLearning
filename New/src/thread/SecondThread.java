package thread;

public class SecondThread implements Runnable{

	private int i;

    public void run() {
        for (; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() 
                + " " + i);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() 
                + " " + i);
            SecondThread st = new SecondThread();
            if (i == 10) {
                new Thread(st, "newThread1").start();
            }
            if (i == 15) {
                new Thread(st, "newThread2").start();
            }

        }
    }

}

