package cdc;
import java.util.*; 
public class Leap__year {
	public static String leap(int year) {
		if((year%4==0 && year%100!=0)||year%400==0) {
			return "leap year";
		}
		else {
			 return "not a leap year";
		}
	}
	@SuppressWarnings("resource")
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		String result=leap(year);
		System.out.println(result);
	}
	


}
