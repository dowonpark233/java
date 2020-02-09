package test06;

import java.util.Scanner;

public class Box {
public static void main(String[] args) {
	double w;
	double h;
	double area;
	double perimeter;
	Scanner input = new Scanner(System.in);
	
	System.out.print("가로 길이를 입력하시오; ");
	w = input.nextDouble();
	System.out.print("세로 길이를 입력하시오;");
	h = input.nextDouble();
	area = w*h;
	perimeter = 2*(w+h);
	System.out.println("사각형의 넓이;"+area+"사각형의 둘레;"+perimeter)
;}
}
