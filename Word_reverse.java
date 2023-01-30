package cdc;

import java.util.Scanner;

public class Word_reverse {
	public static String reverse(String str) {
		String[] arr=str.split(" ");
		String c="";
		for(int i=arr.length-1;i>=0;i--) {
			c=c.concat(arr[i]);
			c=c+" ";
		}
		return c.substring(0,c.length()-1);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverse(str));
		sc.close();
	}
}
