package synchronize;

public class DrawThread extends Thread{
	private Account account;
    private double drawAmount;

    public DrawThread(String name, Account account, double amount) {
        super(name);
        this.account = account;
        this.drawAmount = amount;
    }


    public void run() {
    	synchronized(account) {
        if (this.account.getBalance() >= this.drawAmount) {
            System.out.println(this.getName() + " : Success! draw : " + this.drawAmount);

            try {
                Thread.sleep(1);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }

            this.account.setBalance(this.account.getBalance() - this.drawAmount);
            System.out.println("balance : " + this.account.getBalance());
        } else {
            System.out.println(this.getName() + " : Fail...Not enough balance");
        	}
    	}
    }
}
