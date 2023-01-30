package cdc;
import java.util.*;
public class String_check_pal {
	public static String reverse(String s) {
		String temp ="";
		String patt=" ";
		String []arr=s.split(patt);
		for (int j=0;j<arr.length;j++) {
			int len=arr[j].length();
			for (int i=len-1;i>=0;i--) {
				temp=temp+arr[j].charAt(i);
				
			}
			
			arr[j]=temp;
			temp="";
			
		}
		String c="";
		for(int i=0;i<arr.length;i++) {
			c=c.concat(arr[i]);
			c=c+" ";
		}
		return c.substring(0,c.length()-1);
		
	}
public static boolean pali(String a) {
		
		for(int i=0,j=a.length()-1;i<=j;i++,j--) {
			if(a.charAt(i)!=a.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static String check(String str) {
		if(pali(str)) {
			String c="";
			c="$"+str+"$";
			return c;
		}
		else {
			return reverse(str);
			
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(check(str));
		sc.close();
	}
}
