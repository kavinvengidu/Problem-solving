package cdc;
import java.util.*;
public class Reverse_digit {
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
		}
		return rev;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(reverse(n));
		sc.close();
	}
}
