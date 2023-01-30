package cdc;

import java.util.Scanner;

public class String_stream {
	public static int stream(String a) {
		String c="",d="";
		int count=0;
		for(int i=0,j=a.length()-1;i<a.length();j--,i++) {
			c=""+a.charAt(i);
			d=""+a.charAt(j);
			if(c.matches(d)) {
				count++;
			}
			
		}
		return count;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(stream(a));
		sc.close();
	}

}
