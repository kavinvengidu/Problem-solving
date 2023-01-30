package cdc;
import java.util.*;
public class String_reverse {
	public void reverse(String s) {
		String temp ="";
		String patt=" ";
		String []arr=s.split(patt);
		System.out.println(arr.length);
		for (int j=0;j<arr.length;j++) {
			int len=arr[j].length();
			for (int i=len-1;i>=0;i--) {
				temp=temp+arr[j].charAt(i);
			}
			
			arr[j]=temp;
			
		}
		for(String x:arr) {
			System.out.println(x);
			
		}
		
	}
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * System.out.println("enter the length string:"); 
		 * int len=sc.nextInt();
		 * System.out.println("enter the string:");
		 */
		String str1=sc.nextLine();
		String_reverse obj1=new String_reverse();
		obj1.reverse(str1);
		sc.close();
		
	}

}
