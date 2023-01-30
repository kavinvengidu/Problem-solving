package cdc;
import java.util.*;
public class Prime_number {
	
	public static boolean isPrime(int n) {
		int flag=0;
		if(n==2) {
			return true;
		}
		for(int i=2;i<n;i++) {
			if(n%i!=0) 
				flag=1;
			else {
				flag=0;
			    break;
		}
		}
		if(flag==1)
			return true;
		return false;
			
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean result=isPrime(num);
		if(result) {
			System.out.println(num+" is prime number");
		}
		else
			System.out.println(num+" is not prime number");
	}
}
