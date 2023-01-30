package cdc;
import java.util.*; 
public class Hcf {
	public static int gcd(int a,int b) {
		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
//		int temp=a%b;
//		a=b;
//		b=temp;
//		if(b==0) {
//			return a;
//		}
//		return gcd(a,b);
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}
	public static int hcf(int arr[],int n) {
		
		Arrays.sort(arr);
		int small=arr[0];
		for(int i=1;i<n;i++) {
			small=gcd(small,arr[i]);
		}
		return small;
	}
	public static int lcm(int a,int b) {
		int c=a*b;
		return c/gcd(a,b);
		
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(hcf(arr,n));
		sc.close();
	}

}
