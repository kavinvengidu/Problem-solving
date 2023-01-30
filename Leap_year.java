package cdc;
import java.util.*;
public class Leap_year{
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if((year%4==0 && year%100!=0)||year%400==0) {
		System.out.println("leap year");
	}
	else {
		System.out.println("not a leap year");
	}
	sc.close();
}
}
