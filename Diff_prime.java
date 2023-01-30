package cdc;

import java.util.Arrays;
import java.util.Scanner;

public class Diff_prime {
	public static int diff(int arr[]) {
		int max=-999999,min=999999;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(Prime_number.isPrime(arr[i])) {
				if(arr[i]<=min) {
					min=arr[i];
				}
				if(arr[i]>=max) {
					max=arr[i];
				}
			}
		}
		return Math.abs(max-min);
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println(diff(arr));
		sc.close();
	}
}
