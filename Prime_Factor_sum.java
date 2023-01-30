package cdc;

import java.util.Scanner;

public class Prime_Factor_sum {
	public static int sum(int n) {
		int i=2;
		int sum=0;
		while(n!=0&&i<=n) {
			while(n%i==0) {
			if(Prime_number.isPrime(i)) {
				if(n%i==0) {
					sum+=i;
					n/=i;
				}
			}
			}
			i++;
		}
		return sum;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}
}
