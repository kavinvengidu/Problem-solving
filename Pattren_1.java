package cdc;

import java.util.Scanner;

public class Pattren_1 {
	public static void pattern(int n) {
		for(int i=0;i<n*2-1;i++) {
			for(int j=0;j<(n*2)-1;j++) {
//				if(i+j>=n-1&&j-i<n&&i+j<=(n-1)*3&&i-j<n){
				if(i+j==n-1||j-i==n-1||i+j==(n-1)*3||i-j==n-1) {
					System.out.printf(" *",i,j);
				}
				else
					System.out.printf("  ");
			}
			System.out.printf("\n");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);
		sc.close();
	}
}
