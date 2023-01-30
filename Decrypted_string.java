package cdc;

import java.util.Scanner;

public class Decrypted_string {
	public static String decrypt(String str,int n) {
		int sum=0;
		char c=' ';
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				c=str.charAt(i);
			}
			else {
				sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));
				if(sum>=n) {
					String s=String.valueOf(c);
					return s;
				}
			}
		}
		return "-1";
	}

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		System.out.println(decrypt(str,n));
		sc.close();
}
}
