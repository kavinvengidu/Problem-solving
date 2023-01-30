package cdc;
import java.util.*;
public class Array_diff {
	public static void diff(int arr[],int n) {
		int temp[]=new int[n];
		temp[0]=0;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					temp[i]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(temp[i]+" ");
		}
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//int temp[]=new int[n];
		diff(arr,n);
		sc.close();
	}
}
