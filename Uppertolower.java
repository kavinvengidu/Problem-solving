package cdc;

import java.util.Scanner;

public class Uppertolower {
	public static String uplow(String a) {
		String arr[]=a.split("");
		String c="";
		for(int i=0;i<a.length();i++) {
			
			if(Character.isUpperCase(a.charAt(i))) {
				arr[i]=arr[i].toLowerCase();
			}
			else if(Character.isLowerCase(a.charAt(i))) {
				arr[i]=arr[i].toUpperCase();
			}
			c=c+arr[i];
		}
		return c;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(uplow(a));
		sc.close();
	}
}
