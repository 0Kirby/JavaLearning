package thread;

public class Resource implements Runnable {
	public int i;
	
	public Resource(int i) {
		this.i = i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(i>0) {
				i--;
				System.out.println(Thread.currentThread().getName()+" "+i);}
				else {
					System.out.println(Thread.currentThread().getName());
					break;
				}
			}
		}
	}
