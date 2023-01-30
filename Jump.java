package cdc;
import java.util.Scanner;

public class Jump {
	public static String jump(int arr[],int n,int l) {
		//int flag=0;
		for(int i=0;i<n;i++) {
			if(i+l>=n) {
                System.out.println("1");
                return "YES";
			}
			else if(arr[i+l]!=1) {
				i=i+l-1;
                System.out.println("2");
				continue;
			}
			else if(i+l==n-1&&arr[i+l]==0){
                System.out.println("3");
				return "YES";
			}
			if(arr[i]==1) {
				break;
				
			
			}
			
		}
		return "NO";
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
		int n=sc.nextInt();
		int l=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println(jump(arr,n,l));
		}
		sc.close();
	}
}