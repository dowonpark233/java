package test04;

public class arithop {
public static void main(String[] args) {
	int result; // result = 결과값
	double resultdouble;// resultdouble = 실수 결과값
	result = 3 + 2;
	System.out.println(result);
	result = 3 - 2;
	System.out.println(result);
	result = 3 * 2;
	System.out.println(result);
	result = 3 / 2;
	System.out.println(result);// result = int형이라 정수이다
	resultdouble = 3.0 / 2.0;
	System.out.println(resultdouble);// resultdouble = double형이므로 실수까지 나옴
	result = 3 % 2;
	System.out.println(result);// % = 나머지
}
}