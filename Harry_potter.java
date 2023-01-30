package cdc;

import java.util.Scanner;

public class Harry_potter {
	public static String right_play(String str,int n,int d) {
		String temp[]=str.split("");
		int k=0;
		String c="";
		for(int i=n-d;i<n;i++) {
			temp[k]=""+str.charAt(i);
			k++;
		}
		for(int j=0;j<n-d;j++) {
			temp[k]=""+str.charAt(j);
			k++;
		}
		for(int i=0;i<temp.length;i++) {
			c=c+temp[i];
		}
		return c;
	}
	public static void count(String str,int a,int b) {
		String temp=str;
		int c,k=0;
		String str1;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				c=a;
				str1=right_play(str,str.length(),c);
			}
			else {
				c=b;
				str1=right_play(str,str.length(),c);
			}
			
			if(str1.matches(temp)) {
				break;
			}
			else {
				str=str1;
			}
			k++;
		}
		System.out.println(k+1);
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int a=sc.nextInt();
		int b=sc.nextInt();
		count(str,a,b);
		sc.close();
		}

}
