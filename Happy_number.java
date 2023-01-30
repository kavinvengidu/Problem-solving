package cdc;
import java.util.*;
public class Happy_number {
	public static boolean happy(int n) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum = sum+(rem*rem);
			n=n/10;
		}
		if(sum==1)
			return true;
		else if(sum==4) 
			return false;
		else
			return happy(sum);
	}	
//		int num=n;
//		int sum=0;
////		if(num<10) {
////			return false;
////		}
//		while(num!=0||sum!=1) {
//			while(num>0) {
//				int temp=num%10;
//				sum+=Math.pow(temp, 2);
//				num=num/10;
//				
//			}
//			System.out.println(sum);
//			if(sum!=1) {
//				num=sum;
//				sum=0;
//			}
//			else {
//				break;
//			}
//			
//		}
//		if(sum==1) {
//			
//			return true;
//		}
//		return false;
	
	@SuppressWarnings("resource")
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean result=happy(n);
		if(result) {
			System.out.println("happy number");
		}
		else
			System.out.println("is not happy number");
	}
}
