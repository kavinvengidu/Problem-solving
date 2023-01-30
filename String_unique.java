package cdc;

import java.util.Scanner;

public class String_unique {
	public static String unique(String a) {
		int arr[]=new int[256];
		
		String c="";
		for(int i=0;i<a.length();i++) {
			arr[a.charAt(i)]++;
		}
		for(int i=0;i<a.length();i++) {
			if(arr[a.charAt(i)]==1) {
				c=c+""+a.charAt(i);
			}
		}
		return c;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(unique(a));
		sc.close();
	}

}
