package rnpd;

public class Judgement {
	private int Year;
	public Judgement(int y){
		this.Year=y;
	}
	public void panduan(){
		if((Year%400==0)||(Year%4==0&Year%100!=0)){
			System.out.print(Year + "年是闰年。");
			}
	        else 
	            System.out.print(Year + "年不是闰年。");
		}
	}
