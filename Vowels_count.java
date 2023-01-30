package cdc;

import java.util.Scanner;

public class Vowels_count {
	public static int vcount(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			String c=""+str.charAt(i);
			if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u"))
				count++;
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(vcount(str));
		sc.close();
	}
}
