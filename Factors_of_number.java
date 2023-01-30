package cdc;
import java.util.*;
public class Factors_of_number {
	public static int factor(int a,int b) {
//		int count=0,count1=0;
//		for(int i=a;i<=b;i++) {
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count%2!=0) {
//				count1++;
//			}
//			count=0;
//		}return count1;
//		return (int)Math.sqrt((double)b)-(int)Math.sqrt((double)a-1);
		return (int) (Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1);
	}
	public static void main(String args[]) { 
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=factor(a,b);
		System.out.println(result);
		sc.close();
	}
}
