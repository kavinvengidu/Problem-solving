package cdc;
import java.util.*;
public class flipflop_pattern {
	public static void pattern(int n) {
//		int minrow=0,maxrow=n-1;
//		int value=1;
//		int arr[][]=new int[n][n];
//		while(value<=n*n) {
//			for(int i=0;i<n;i++) {
//				arr[minrow][i]=value;
//				value++;
//			}
//			if(value>n*n) {
//				break;
//			}
//			for(int i=0;i<n;i++) {
//				arr[maxrow][i]=value;
//				value++;
//			}
//			minrow++;
//			maxrow--;
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(j==n-1?arr[i][j]:arr[i][j]+"*");
//			}
//			System.out.println();
//		}
		
	}
	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			pattern(n);
			sc.close();
			}
}
