package test06;

import java.util.Scanner;

public class Box {
public static void main(String[] args) {
	double w;
	double h;
	double area;
	double perimeter;
	Scanner input = new Scanner(System.in);
	
	System.out.print("���� ���̸� �Է��Ͻÿ�; ");
	w = input.nextDouble();
	System.out.print("���� ���̸� �Է��Ͻÿ�;");
	h = input.nextDouble();
	area = w*h;
	perimeter = 2*(w+h);
	System.out.println("�簢���� ����;"+area+"�簢���� �ѷ�;"+perimeter)
;}
}
