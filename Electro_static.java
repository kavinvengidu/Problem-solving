package cdc;

import java.util.Scanner;

public class Electro_static {
	public static int statics(String str,int arr[]) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			String c=""+str.charAt(i);
			if(c.equalsIgnoreCase("p")) {
				sum+=arr[i];
			}
			else {
				sum-=arr[i];
			}
		}
		return Math.abs(sum)*100;
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int arr[]=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(statics(str,arr));
		sc.close();
		}

}
