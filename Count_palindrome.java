package cdc;

import java.util.Scanner;

public class Count_palindrome {
public static boolean pali(String a) {
		
		for(int i=0,j=a.length()-1;i<=j;i++,j--) {
			if(a.charAt(i)!=a.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static int count(String str) {
//		int i=0,j=0,count1=0;
//        String temp=str;
//        String ans="";
//        for(i=0;i<str.length()-1;i++)
//        {
//            ans="";
//            for(j=i;j>=0;j--)
//            {
//                ans+=String.valueOf(str.charAt(j));
//            }
//            temp=str+ans;
//            
//            if(pali(temp))
//            {
//                break;
//            }
//        }
//        count1=ans.length();
//		return count1;
		String c="";
		int i;
		for(i=0;i<str.length();i++) {
			c=str.substring(i,str.length());
			System.out.println(c);
			if(pali(c)) {
				break;
			}
		}
		return i;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(count(str));
		sc.close();
		}

}
