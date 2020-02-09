package test06;

import java.util.Scanner;

public class CircleArea {
public static void main(String[] args) {
	double Area;
	int radius;
	Scanner sc = new Scanner(System.in);
	System.out.println("반지름을 입력하시오");
	radius = sc.nextInt();
	Area=radius *radius*3.14;
	System.out.print(Area);
	
	
	
	
}
}
