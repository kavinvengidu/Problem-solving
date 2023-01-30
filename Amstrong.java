package cdc;

import java.util.Scanner;
import java.lang.Math;
public class Amstrong {
	public static long amstrong(long num) {
		long num1=num;
		long sum=0;
		int count=0;
		while(num1>0) {
			num1=num1/10;
			count+=1;
		}
		while(num>0) {
			long temp=num%10;
			sum+=Math.pow(temp, count);
			num=num/10;
		}
		return sum;
	}
		

	@SuppressWarnings({  "resource" })
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long result=amstrong(num);
		System.out.println(result);
		
	}
}
