package cdc;

import java.util.Scanner;

public class Pattern_2 {
	public static void pattern(int n) {
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					temp++;
					System.out.printf(" %d",temp);
				}
				else
					System.out.printf("  ");
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
