package test06;

import java.util.Scanner;

public class Salary {
public static void main(String[] args) {
	int salary;//����
	int deposit;//�����
	Scanner input = new Scanner(System.in);
	
	System.out.print("������ �Է��Ͻÿ�");//�Է� �ȳ� ��Ʈ
	salary=input.nextInt();
	
	deposit=10*12*salary;
	System.out.printf("10�� ������ �����; %d\n",deposit);
}
}
