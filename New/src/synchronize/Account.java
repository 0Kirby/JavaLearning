package synchronize;

public class Account {
	 	private String accountNr;
	    private double balance;

	    public Account() {

	    }

	    public Account(String accountNr, double balance) {
	        this.accountNr = accountNr;
	        this.balance = balance;
	    }

	    public String getAccountNr() {
	        return accountNr;
	    }

	    public void setAccountNr(String accountNr) {
	        this.accountNr = accountNr;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public int hashCode() {
	        return this.accountNr.hashCode();
	    }

	    public boolean equals(Account account) {
	        return account.getAccountNr().equals(this.accountNr);
	    }
}
