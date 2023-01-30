package cdc;
import java.util.*;
public class Vowels {
	public static void remove(String str) {
		int uppercount=0,digitcount=0,specialcount=0,lowercount=0;
		for(int i=str.length()-1;i>=0;i--) {
			char a=str.charAt(i);
			if(a<=90&&a>=65) {
				uppercount++;
			}
			if(a>96&&a<=122) {
				lowercount++;
			}
			if(a>=48&&a<=57)
				digitcount++;
			if((a>=58&&a<=64)||(a>=40&&a<=47)||(a<127&&a>122)||(a>31&&a<48))
				specialcount++;
			}
		System.out.println("Upper count : "+uppercount);
		System.out.println("Lower count : "+lowercount);
		System.out.println("Digit count : "+digitcount);
		System.out.println("Special characters count : "+specialcount);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		remove(str);
		sc.close();
	}
}
