package test07;

public class Stringswitch {
 public static void main(String[] args) {
	 String month = "9��";
	 int monthnumber;
	 switch (month) {
	 case "1��":
		 monthnumber =1;
		 break;
	 case "2��":
		 monthnumber =2;
		 break;
	 case "3��":
		 monthnumber =3;
		 break;
     default :
    	 monthnumber =0;
    	 break;
 }
	 System.out.println(monthnumber);
}
}