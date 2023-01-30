package cdc;
import java.util.*;
public class Array_shift {
	public static int[] left_play(int arr[],int n,int d) {
		int temp[]=new int[n];
		int k=0;
		for(int i=d;i<n;i++) {
			temp[k]=arr[i];
			k++;
		}
		for(int j=0;j<d;j++) {
			temp[k]=arr[j];
			k++;
		}
		
		return temp;
	}
	public static int[] right_play(int arr[],int n,int d) {
		int temp[]=new int[n];
		int k=0;
		for(int i=n-d;i<n;i++) {
			temp[k]=arr[i];
			k++;
		}
		for(int j=0;j<n-d;j++) {
			temp[k]=arr[j];
			k++;
		}
		
		return temp;
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		int arr1[]=new int [n];
		int arr2[]=new int [n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int d=sc.nextInt();
		arr1=left_play(arr,n,d);
		System.out.println("Left rotation: ");
		for(int i=0;i<n;i++)
			System.out.print(arr1[i]+" ");
		arr2=right_play(arr,n,d);
		System.out.println();
		System.out.println("Right rotation:");
		for(int i=0;i<n;i++)
			System.out.print(arr2[i]+" ");
		sc.close();
			}
}
