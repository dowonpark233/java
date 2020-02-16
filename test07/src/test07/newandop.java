package test07;

public class newandop {
 public static void main(String[] args) {
	 int x=1;
	 int y=1;
	 int nextx= ++x;
	 int nexty= y++;
	 System.out.println(nextx);//2
	 System.out.println(nexty);//1
	 System.out.println(x);//2
	 System.out.println(y);//2
	 int backx=--x;
	 int backy=y--;
	 System.out.println(backx);//1
	 System.out.println(backy);//2
	 System.out.println(x);//1
	 System.out.println(y);//1
 }
}
