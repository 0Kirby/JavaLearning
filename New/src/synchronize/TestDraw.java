package synchronize;

public class TestDraw {
	public static void main(String[] args) {
        Account account = new Account("1568856", 1000);
        new DrawThread("A", account, 800).start();
        new DrawThread("B", account, 800).start();
	}
}
