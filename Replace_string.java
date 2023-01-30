package cdc;

import java.util.Scanner;

public class Replace_string {
	public static String replace(String str,String a,String b) {
		String str1[]=str.split("");
		String c="";
		if(str.matches(""))
			return "Null";
		for(int i=0;i<str1.length;i++) {
			if(str1[i].matches(a))
				str1[i]=b;
			else if(str1[i].matches(b))
				str1[i]=a;
		}
		for(int i=0;i<str1.length;i++) {
			c=c+str1[i];
		}
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String a=sc.next();
		String b=sc.next();
		System.out.println(replace(str,a,b));
		sc.close();
		}
}
