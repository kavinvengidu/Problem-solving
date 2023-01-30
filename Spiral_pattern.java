package cdc;

import java.util.Scanner;

public class Spiral_pattern {
	public static Scanner sc=new Scanner(System.in);
	public static void pattern(int n) {
		int maxrow=n-1;
		int minrow=0;
		int maxcol=n-1;
		int mincol=0;
		int k=1;
		int arr[][]=new int[n][n];
		while(k<=n*n) {
			for(int i=mincol;i<=maxcol;i++) {
				arr[minrow][i]=k;
				k++;
			}
			for(int i=minrow+1;i<=maxrow;i++) {
				arr[i][maxcol]=k;
				k++;
			}
			for(int i=maxcol-1;i>=mincol;i--) {
				arr[maxrow][i]=k;
				k++;
			}
			for(int i=maxrow-1;i>minrow;i--) {
				arr[i][mincol]=k;
				k++;
			}
			minrow++;
			maxrow--;
			mincol++;
			maxcol--;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%02d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void main(String args[]) {
		
		int n=sc.nextInt();
		pattern(n);
		sc.close();
	}
}
