package cdc;
import java.util.*;
public class Sum_of_digits {
	public static int sod(int num) {
		if(num%9==0) {
			return 9;
		}
		else
			return num%9;
//		long sum=0;
//		long num1=num;
//		while(num1>9) {
//			while(num1>0) {
//				long temp=num1%10;
//				sum+=temp;
//				num1=num1/10;
//				}
//			if(sum/10!=0) {
//				num1=sum;
//				sum=0;
//				}
//			else {
//				break;
//				}
//			}
//		return sum;
		}
	@SuppressWarnings("resource")
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=sod(num);
		System.out.println(result);
		}
}
