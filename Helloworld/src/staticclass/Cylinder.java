package staticclass;

public class Cylinder extends Circle{
	 private double hight;
	 public Cylinder (double r, double h ){
		 super.setRadius(r);
		 this.hight=h; 
		 }
	 
		 public double getVolume(){
			 return Math.PI*this.getRadius()*this.getRadius()*this.hight;
			 }
		 public double getArea(){
			 return 2*Math.PI*this.getRadius()*this.getRadius()+2*Math.PI*this.getRadius()*this.hight;
		 }
			 public void show (){
				 System.out.println("�뾶RΪ��"+this.getRadius()+";\n"+"�����SΪ��"+this.getArea()+";\n"+"Բ�ܳ�CΪ��"+this.getRadius()*2*Math.PI+";\n"+"���VΪ��"+this.getVolume()+"\n");
			 }
			 
	 }
