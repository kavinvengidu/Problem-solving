package cdc;

import java.util.Scanner;

public class Char_repeating {
	public static char repeat(String str) {
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		int max=0;
		int ind=0;
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]>max) {
				max=arr[str.charAt(i)];
				ind=str.charAt(i);
			}
		}
		
		return (char)(ind);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(repeat(a));
		sc.close();
		}

}
//import java.util.Scanner;
//public class ptp6
//{
//    public static void main(String a[])
//    {
//        int count=0;
//        int max=0;
//        int i,j,max_index=0;
//        Scanner sc=new Scanner(System.in);
//        String value=sc.next();
//        for(i=0;i<value.length();i++)
//        {
//            count=1;
//            for(j=i+1;j<value.length();j++)
//            {
//                if(value.charAt(i)==value.charAt(j))
//                {
//                    count++;
//                }
//            }
//            if(count>max)
//            {
//                max=count;
//                max_index=i;
//            }
//        }
//        System.out.print("the character with high frequency is:"+value.charAt(max_index));
//    }
//}
