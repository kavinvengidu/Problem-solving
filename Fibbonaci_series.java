package cdc;
import java.util.*;
public class Fibbonaci_series {
	public static long fibonaci1(Long n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		return fibonaci1(n-1)+fibonaci1(n-2);
	}
	public static void fibonaci(int n) {
//		int num=0, sum=1, temp=num;
//		System.out.print(num);
//		while(temp<n) {
//			System.out.print(" ");
//			System.out.print(sum);
//			temp=sum+num;
//			num=sum;
//			sum=temp;
//			}
		int a=-1,b=1,c;
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
//		fibonaci(n);
		System.out.println(fibonaci1(n));
	}

}
