package test06;

import java.util.Scanner;

public class tax {
public static void main(String[] args) {
	int income; //����ǥ��
	int tax;//����
	System.out.println("����ǥ�� �ݾ��� �Է��ϼ���");
	Scanner dcc = new Scanner(System.in);
	income = dcc.nextInt();
	if (income <= 1000) 
		tax = (int)(income * 0.09);
	else if (income <= 4000) 
		tax = (int)(income *0.18);
	else if (income <8000)
		tax = (int)(income *0.27);
	else tax = (int)(income *0.36);
	System.out.println(tax);
}
}