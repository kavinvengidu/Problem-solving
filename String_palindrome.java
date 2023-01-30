package cdc;

import java.util.Scanner;

public class String_palindrome {
	public static String pali(String a) {
		
		for(int i=0,j=a.length()-1;i<=j;i++,j--) {
			if(a.charAt(i)!=a.charAt(j)) {
				return "Not a palindrome";
			}
		}
		return "A palindrome";
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(pali(str));
		sc.close();
	}

}
