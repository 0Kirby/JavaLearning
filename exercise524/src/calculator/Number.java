package calculator;

public class Number {
	private int n1;
	private int n2;

	public Number() {
	}

	public Number(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int addition(){
		return this.n1 + this.n2;
	}
	
	public int subtration(){
		return this.n1 - this.n2;
	}
	
	public int multiplication(){
		return this.n1 * this.n2;
	}
	
	public int division(){
		return this.n1 / this.n2;
	}

	public String toString() {
		return "Number [addition()=" + addition() + ", subtration()=" + subtration() + ", multiplication()="
				+ multiplication() + ", division()=" + division() + "]";
	}
	
	
}
