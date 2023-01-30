package cdc;

import java.util.Scanner;

public class Number_pattern {
	public static void patt(int n) {
		int k=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				int temp=k-1+i;
				for(int j=i;j>0;j--) {
					System.out.printf("%02d ",temp);
					k++;
					temp--;
				}
			}
			else {
				for(int j=i;j>0;j--) {
					System.out.printf("%02d ",k);
					k++;
				}
			}
			
			System.out.println();
		}
		
	}
	public static void main(String args []) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	patt(n);
	sc.close();
	}
}
