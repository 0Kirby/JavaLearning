package zuche;

import java.util.Scanner;

public class TestDemo {

	private static Scanner s,s0,s1,s2; //������
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach car1 = new Coach(1, "�µ�A4", 500, 4);            //�ֱ������ֳ��͵Ķ���
		Coach car2 = new Coach(2, "���Դ�6", 400, 4);
		Complex car3 = new Complex(3, "Ƥ��ѩ6", 450, 4, 2);
		Coach car4 = new Coach(4, "����", 800, 20);
		Truck car5 = new Truck(5, "�ɻ���", 400, 4);
		Truck car6 = new Truck(6, "��ά��", 1000, 20);
		
		System.out.println("��ӭʹ�ô���⳵ϵͳ��\n���Ƿ�Ҫ�⳵��1�� 0��");
		s1 = new Scanner(System.in);
		int flag = s1.nextInt();
		switch (flag){ //�ж��Ƿ����ϵͳ
		case 0:
			System.out.println("��ӭ���´�ʹ�ñ���˾��Ʒ��");
			break;
		case 1:
			System.out.println("�����⳵�����ͼ����Ŀ����\n��� ��������           ���             ����\n" //��ӡ�⳵�б�
					+ "1. �µ�A4 500Ԫ/��      ���ˣ�4��\n"
					+ "2. ���Դ�6 400Ԫ/��     ���ˣ�4��\n"
					+ "3. Ƥ��ѩ6 450Ԫ/��     ���ˣ�4�� �ػ���2��\n"
					+ "4. ����           800Ԫ/��     ���ˣ�20��\n"
					+ "5. �ɻ���      400Ԫ/��      �ػ���4��\n"
					+ "6. ��ά��      1000Ԫ/��  �ػ���20��\n");
			System.out.println("��������Ҫ�⳵��������");
			s2 = new Scanner(System.in); //�����⳵����
			int amount = s2.nextInt();
			int data[]=new int[amount];
			for(int i=0;i<=amount-1;i++){ //���⳵��Ϣ��������
				System.out.println("�������"+(i+1)+"��������ţ�");
				s = new Scanner(System.in);
				data[i] = s.nextInt();
			}
			System.out.println("�������⳵������");
			s0 = new Scanner(System.in); //�����⳵����
			int day = s0.nextInt();
			System.out.println("�����˵���");
			
			int people = 0;
			System.out.println("***�����˵ĳ��У�");
			for(int k=0;k<=amount-1;k++){
				switch(data[k]){ //ѭ��������˳���������
				case 1:
					people += car1.getPeople();
					System.out.print(car1.getName()+" ");
					break;
				case 2:
					people += car2.getPeople();
					System.out.print(car2.getName()+" ");
					break;
				case 3:
					people += car3.getPeople();
					System.out.print(car3.getName()+" ");
					break;
				case 4:
					System.out.print(car4.getName()+" ");
					people += car4.getPeople();
					break;
				}
			}
			System.out.print("�����ˣ�"+people+"��\n"); //���㲢���������
			
			int goods = 0;
			System.out.println("***���ػ��ĳ��У�");
			for(int l=0;l<=amount-1;l++){
				switch(data[l]){ //ѭ������ػ�����������
				case 3:
					goods += car3.getGoods();
					System.out.print(car3.getName()+" ");
					break;
				case 5:
					goods += car5.getGoods();
					System.out.print(car5.getName()+" ");
					break;
				case 6:
					goods += car6.getGoods();
					System.out.print(car6.getName()+" ");
					break;
				}
			}
			System.out.print("���ػ���"+goods+".0��\n"); //���㲢������ػ���
			
			int price = 0;
			for(int j=0;j<=amount-1;j++){
				switch(data[j]){
				case 1:
					price += car1.getMoney();
					break;
				case 2:
					price += car2.getMoney();
					break;
				case 3:
					price += car3.getMoney();
					break;
				case 4:
					price += car4.getMoney();
					break;
				case 5:
					price += car5.getMoney();
					break;
				case 6:
					price += car6.getMoney();
					break;
				}
			}
			System.out.println("***�⳵�ܼ۸�"+ price*day+".0Ԫ"); //����ܼ�
			System.out.println("��ȷ��������Ϣ����л��ʹ�ñ���˾��Ʒ��");
			break;
		default:
		System.out.println("�������"); //�쳣��ʾ
		}
	}
}