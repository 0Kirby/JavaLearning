package thread;

public class FirstThread extends Thread{
	private int i;

    public void run() {
        for (; i < 20; i++) {
            // ʹ�� getName()���������ص�ǰ�̵߳�����
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {

            // ʹ��Thread��ľ�̬���� currentThread() ����ȡ��ǰ�߳�
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