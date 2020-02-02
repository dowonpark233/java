package test05;

import java.util.Scanner;

public class pay {
public static void main(String[] args) {
	final int RATE=5000;
	int pay;//월급
	int hours;//시간
	Scanner sc=new Scanner(System.in);
	
	System.out.print("시간을 입력하세요:");
	hours=sc.nextInt();
	System.out.println("당신이 일한시간은?"+hours);
	
	if (hours>=8) {
		System.out.println("당신에게 보너스를 드리겠습니다");
		pay=30*hours*RATE+500000;
		System.out.println("그렇기 때문에 당신의 월급은"+pay);
	}
	else {
		pay=30*hours*RATE;
		System.out.println("그렇기 때문에 당신의 월급은"+pay);
	}
	
}

}
