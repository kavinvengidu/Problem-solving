package cdc;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		int sum=1;
		int total=0;
		while(n>0){
			int num=n%10;
			for (int i=num;i>0;i--) {
				sum*=i;
			}
			total+=sum;
			n/=10;
			sum=1;
		
		
		}
		return total;
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=fact(num);
		if(result==num) {
			System.out.println("it is strong number");
		}
		else
			System.out.println("it is not strong number");
	}
}
