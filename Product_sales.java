package cdc;

import java.util.Scanner;

public class Product_sales {
	public static int count(String str,int n) {
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[str.charAt(i)]*str.charAt(i);
			
		}
		return sum;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		System.out.println(count(str,n));
		sc.close();
	}

}
