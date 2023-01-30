package cdc;

import java.util.Scanner;

public class To_binary {
	public static int convert(int n) {
		if(n<=1) {
			return n;
		}
		return n%2+(convert(n/2)*10);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		 System.out.println(convert(i));
		sc.close();
	}
}
