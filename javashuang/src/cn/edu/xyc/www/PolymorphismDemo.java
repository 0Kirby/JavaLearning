package cn.edu.xyc.www;

public class PolymorphismDemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes obj = new Shapes();  //���������ָ�����ʵ��
	    obj.draw();                 //���û�ͼ����
	    obj = new Circle();         //���������ָ�������ʵ��
	    obj.draw();                 //���û�ͼ����
	    obj = new Square();         //���������ָ�������ʵ��
	    obj.draw();                 
	}

}
