package test07;

import java.util.Scanner;

public class daysmonth {
 public static void main(String[] args) {
	 int month;
	 int years=2009;
	 int days=0;
	 System.out.println("일수를 입력하세요");
	 Scanner sc=new Scanner(System.in);
	 month=sc.nextInt();
	 switch (month) {
	 case 1:
	 case 3:
	 case 5:
	 case 7:
	 case 8:
	 case 10:
	 case 12:
		 days = 31;
		 break ;
	 case 4:
	 case 6:
	 case 9:
	 case 11:
		 days =30;
		 break;
	 case 2:
		 if (years%4==0) { 
		 days =29;}
		 else {
			

		 
			 days =28;} 
		 break;
		 default: System.out.println("월이 잘못입력되었습니다");
		 break;
	 }
	 System.out.println("월의 날수는?"+days);
 }
  
}
 