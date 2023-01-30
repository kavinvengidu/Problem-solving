package cdc;
import java.util.*;

public class Array2d {
	/*
	 * 1. printing upper triangle matrix
	 * 2. rotate 90 degree and 180
	 * 3. diagonal difference
	 * 4. add two matrix
	 * 5. multiply of two matrix
	 */
	public static void majorupper(int arr[][],int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i<=j) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
		}
	}
	public static void majorlower(int arr[][],int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i>=j) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
		}
	}
	public static void minorupper(int arr[][],int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i+j>=r-1) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
		}
	}
	public static void minorlower(int arr[][],int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i+j<=r-1) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
		}
	}
	public static int[][] rotate(int arr[][],int r,int c,int deg,String dir) {
		int arr1[][]=new int[r][c];
		int k=0;
		if(deg==90&&dir.matches("clock")) {
			for(int i=0;i<r;i++) {
				for(int j=c-1;j>=0;j--) {
					
					arr1[i][k]=arr[j][i];
					k++;
				}
				k=0;
			}
			k=0;
			return arr1;
		}
		if(deg==90&&dir.matches("anticlock")) {
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					arr1[i][j]=arr[j][i];
				}
			}
			return arr1;
		}
		if(deg==180&&dir.matches("anticlock")) {
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					arr1[i][j]=arr[j][i];
				}
			}
			return rotate(arr1,r,c,90,dir);
		}
		if(deg==180&&dir.matches("clock")) {
			for(int i=0;i<r;i++) {
				for(int j=c-1;j>=0;j--) {
					arr1[i][k]=arr[j][i];
					k++;
				}
				k=0;
			}
			k=0;
			
			return rotate(arr1,r,c,90,dir);
		}
		return arr1;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Major upper triangle");
		majorupper(arr,r,c);
		System.out.println("Major lower triangle");
		majorlower(arr,r,c);
		System.out.println("Minor upper triangle");
		minorupper(arr,r,c);
		System.out.println("Minor lower triangle");
		minorlower(arr,r,c);
		System.out.println("rotate:");
		System.out.println("Enter the degree of rotation(90/180):");
		int deg=sc.nextInt();
		System.out.println("Enter the direaction of rotation(clock/anticlock):");
		String dir=sc.next();
		int arr1[][]=new int[r][c];
		
		arr1=rotate(arr,r,c,deg,dir);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
