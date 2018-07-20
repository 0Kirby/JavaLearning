package array2;

public class Minus {
	private int oldArr[];
	private int newArr[];
	private int count;
	public Minus() {
	
	}
	public Minus(int[] oldArr) {
		this.oldArr = oldArr;

	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int[] getOldArr() {
		return oldArr;
	}
	public void setOldArr(int[] oldArr) {
		this.oldArr = oldArr;
	}
	
	public int[] getNewArr() {
		return newArr;
	}
	public void setNewArr(int[] newArr) {
		this.newArr = newArr;
	}
	
	public int Count(){
		for(int i = 0; i<oldArr.length ; i++)
			if ( oldArr[i] != 0)
			count++;
		return count;
	}
	
	public void Delete(int[] oldArr,int[] newArr){
		int foot = 0;
		for(int i = 0; i<oldArr.length ; i++)
		{
			if ( oldArr[i] != 0)
			{
				newArr[foot++] = oldArr[i];
			}
		}
	}
	
	
}
