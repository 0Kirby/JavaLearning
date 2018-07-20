package thread;

public class Adder extends Thread{
	int datas[] = null;
	public int total = 0;
	Adder(int []datas){
		this.datas = datas;
	}
	public void run() {
		int sum = 0;
		for(int i=0;i<datas.length;i++) {
			sum += datas[i];
		}
		total = sum;
	}
}

