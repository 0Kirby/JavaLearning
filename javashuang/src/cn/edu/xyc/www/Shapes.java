package cn.edu.xyc.www;

class Shapes {  //������״��
	  public void draw() {  //��ͼ�ķ���
	    System.out.println("������һ��������״��");
	  }
	}

	class Circle extends Shapes {  //Բ����̳��ڻ�����״��
	  public void draw() {  //���Ǹ���Ļ�ͼ����
	    System.out.println("������һ��Բ�Ρ�");
	  }
	} 

	class Square extends Shapes {  //��������̳��������״��
	  public void draw() {  //���Ǹ���Ļ�ͼ����
	    System.out.println("������һ�������Ρ�");
	  }
	}
