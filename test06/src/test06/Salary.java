package test06;

import java.util.Scanner;

public class Salary {
public static void main(String[] args) {
	int salary;//월급
	int deposit;//저축액
	Scanner input = new Scanner(System.in);
	
	System.out.print("월급을 입력하시오");//입력 안내 멘트
	salary=input.nextInt();
	
	deposit=10*12*salary;
	System.out.printf("10년 동안의 저축액; %d\n",deposit);
}
}
