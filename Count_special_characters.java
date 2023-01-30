package cdc;

import java.util.Scanner;

public class Count_special_characters {
	public static int count_special(String a) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			int temp=a.charAt(i);
			
			if((temp<48||temp>57)&&(temp<65||temp>90)&&(temp<97||temp>122))
				count++;
		}
		return count;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(count_special(a));
		sc.close();
	}
}
