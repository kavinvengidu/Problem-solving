package cdc;

import java.util.Scanner;

public class Palindrome {
	public static String palindrome(int n) {
		int rev=0,temp=n;
		while(n>0) {
			int rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
		}
		if(rev==temp) {
			return "It is palindrome";
		}
		return "It is not palindrome";
	}
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(palindrome(n));
		sc.close();
	}
}
