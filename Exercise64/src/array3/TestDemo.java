package array3;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person per [] = new Person [3] ; // ��������
        per[0] = new Person("����",20) ;
        per[1] = new Person("����",21) ;
        per[2] = new Person("����",22) ;
        for (int x = 0 ; x < per.length ; x ++) 
        {
        	System.out.println(per[x].getInfo()) ;
        }    

        
        Person per2 [] = new Person []{new Person("����",20),new Person("����",21),new Person("����",22)} ;
        for (int y = 0 ; y < per2.length ; y ++) 
        {
        	System.out.println(per2[y].getInfo()) ;
        }    
	}

}
