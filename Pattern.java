package cdc;
import java.util.Scanner;

public class Pattern {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int sp=n-i;sp>0;sp--) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				if(j==0 || j==2*i-1-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int sp=n-i;sp>0;sp--) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				if(j==0 || j==2*i-1-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
//			for(int j=0;j<(n*2)-1;j++) {
//				if(i+j>=n-1&&j-i<n){
//					System.out.printf(" *",i,j);
//				}
//				else
//					System.out.printf("  ");
//			}
			
		}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);
		sc.close();
	}
}
