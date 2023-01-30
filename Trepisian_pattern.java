package cdc;

import java.util.Scanner;

public class Trepisian_pattern {
	public static void pattern(int n) {
		int temp=0,temp1=0,c=0;
		for(int i=0;i<n;i++) {
			for(int sp=0;sp<i;sp++) {
				System.out.print("  ");
			}
			int len=n*2-i;
			for(int j=i;j<len;j++) {
				
				if(j>=n*2/2) {
					temp=(n*(n+1))-(temp1-1);
					temp+=c;
					System.out.print("*"+temp);
					c++;
				}
				else {
					c=0;
					temp1++;
				System.out.print(j==i?temp1:"*"+temp1);
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);
		sc.close();
	}

}
