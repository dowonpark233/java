package test05;

import java.util.Scanner;

public class pay {
public static void main(String[] args) {
	final int RATE=5000;
	int pay;//����
	int hours;//�ð�
	Scanner sc=new Scanner(System.in);
	
	System.out.print("�ð��� �Է��ϼ���:");
	hours=sc.nextInt();
	System.out.println("����� ���ѽð���?"+hours);
	
	if (hours>=8) {
		System.out.println("��ſ��� ���ʽ��� �帮�ڽ��ϴ�");
		pay=30*hours*RATE+500000;
		System.out.println("�׷��� ������ ����� ������"+pay);
	}
	else {
		pay=30*hours*RATE;
		System.out.println("�׷��� ������ ����� ������"+pay);
	}
	
}

}
