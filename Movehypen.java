package cdc;

import java.util.Scanner;

public class Movehypen {
	public static String movehypen(String str) {
//		String arr[]=str.split("-");
		String c="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='-') {
				c=c+""+str.charAt(i);
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			c=c+arr[i];
//		}
		str=str.replace("-", "");
		c=c+str;
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(movehypen(str));
		sc.close();
		}

}
