package zuche;

import java.util.Scanner;

public class TestDemo {

	private static Scanner s,s0,s1,s2; //构造器
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach car1 = new Coach(1, "奥迪A4", 500, 4);            //分别建立六种车型的对象
		Coach car2 = new Coach(2, "马自达6", 400, 4);
		Complex car3 = new Complex(3, "皮卡雪6", 450, 4, 2);
		Coach car4 = new Coach(4, "金龙", 800, 20);
		Truck car5 = new Truck(5, "松花江", 400, 4);
		Truck car6 = new Truck(6, "依维柯", 1000, 20);
		
		System.out.println("欢迎使用答答租车系统；\n您是否要租车：1是 0否");
		s1 = new Scanner(System.in);
		int flag = s1.nextInt();
		switch (flag){ //判断是否进入系统
		case 0:
			System.out.println("欢迎您下次使用本公司产品！");
			break;
		case 1:
			System.out.println("您可租车的类型及其价目表：\n序号 汽车名称           租金             容量\n" //打印租车列表
					+ "1. 奥迪A4 500元/天      载人：4人\n"
					+ "2. 马自达6 400元/天     载人：4人\n"
					+ "3. 皮卡雪6 450元/天     载人：4人 载货：2吨\n"
					+ "4. 金龙           800元/天     载人：20人\n"
					+ "5. 松花江      400元/天      载货：4吨\n"
					+ "6. 依维柯      1000元/天  载货：20吨\n");
			System.out.println("请输入您要租车的数量：");
			s2 = new Scanner(System.in); //接收租车数量
			int amount = s2.nextInt();
			int data[]=new int[amount];
			for(int i=0;i<=amount-1;i++){ //将租车信息存入数组
				System.out.println("请输入第"+(i+1)+"辆车的序号：");
				s = new Scanner(System.in);
				data[i] = s.nextInt();
			}
			System.out.println("请输入租车天数：");
			s0 = new Scanner(System.in); //接收租车天数
			int day = s0.nextInt();
			System.out.println("您的账单：");
			
			int people = 0;
			System.out.println("***可载人的车有：");
			for(int k=0;k<=amount-1;k++){
				switch(data[k]){ //循环输出载人车辆的种类
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
			System.out.print("共载人："+people+"人\n"); //计算并输出总人数
			
			int goods = 0;
			System.out.println("***可载货的车有：");
			for(int l=0;l<=amount-1;l++){
				switch(data[l]){ //循环输出载货车辆的种类
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
			System.out.print("共载货："+goods+".0吨\n"); //计算并输出总载货量
			
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
			System.out.println("***租车总价格："+ price*day+".0元"); //输出总价
			System.out.println("请确认以上信息，感谢您使用本公司产品！");
			break;
		default:
		System.out.println("输入错误！"); //异常提示
		}
	}
}
