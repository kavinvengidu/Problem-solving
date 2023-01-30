package cdc;

import java.util.Scanner;

public class Number_to_String {
	public static int sod(int n) {
		int num1=n;
		int sum=0;
		while(num1>0) {
			int temp=num1%10;
			sum+=temp;
			num1/=10;
			}
		return sum;
		}
	public static String numtochar(int n) {
		int sum=0;
		sum=sod(n);
		if(sum>=0&&sum<27) {
			if(sum==0)return "Invalid";
			sum=sum+64;
			String c=""+(char)sum;
			return c;
		}
		return numtochar(sum);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(numtochar(a));
		sc.close();
	}
}
