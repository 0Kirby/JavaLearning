package array2;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oldArr[] = new int[] {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
		Minus minus = new Minus(oldArr);
		int count = minus.Count();		
		int newArr[] = new int[count];
		
		minus.Delete(oldArr,newArr);
		
		for(int k = 0;k<newArr.length-1;k++){
			System.out.print(newArr[k]+",");
		}
		System.out.print(newArr[count-1]);
	}
}
