package thread;

public class FirstThread extends Thread{
	private int i;

    public void run() {
        for (; i < 20; i++) {
            // 使用 getName()方法来返回当前线程的名字
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {

            // 使用Thread类的静态方法 currentThread() 来获取当前线程
            System.out.println(Thread.currentThread().getName() 
                + " " + i);

            if (i == 10) {
                new FirstThread().start();
            }
            if (i == 15) {
                new FirstThread().start();
            }

        }
    }
}