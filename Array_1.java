package cdc;

import java.util.*;

public class Array_1 {
	static Scanner sc=new Scanner(System.in);
    public static void main(String a[])
    {
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int arr[] =new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
//        Arrays.sort(arr);
        int max=-99999;
        int min=99999;
        for(int i=0;i<size-1;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        	if(arr[i]<min) {
        		min=arr[i];
        	}
        }
        int tot=max+min;
        System.out.println(tot);
        
    }
}
