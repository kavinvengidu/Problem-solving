package cdc;

import java.util.Scanner;
//seive of erastosthenes n*log(log)
public class prime_number_range {
	public static boolean isPrime(int n) {
		int flag=1;
		if(n==2) {
			return true;
		}
		else if(n%2==0)
			return false;
		else {
			for(int i=3;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					flag=0;
					break;
				}
			}
			if(flag==1)
				return true;
			return false;
			}
		}

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<num;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
}
}
