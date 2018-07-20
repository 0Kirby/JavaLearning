package thread;

public class Join {

    public static void main(String[] args) {

        JoinThread jt = new JoinThread();

        new Thread(jt, "HelloWorld").start();

        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                Thread joinThread = new Thread(jt, "joinThread");
                joinThread.start();
                try {
                    joinThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + " : " + i );
        }
    }

}