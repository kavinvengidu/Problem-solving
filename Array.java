package cdc;
import java.util.*;
public class Array
{
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
        System.out.print("Before removing duplicate:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
//        for(int i=0;i<size-1;i++)
//        {
//            for(int j=i+1;j<size;j++)
//            {
//                if(arr[i]==arr[j])
//                {
//                    while(j<size-1)
//                    {
//                        arr[j]=arr[j+1];
//                        j++;
//                    }
//                    size--;
//                }
//            }
//
//        }
//        int changedArr[] = new int[size];
//        System.out.print("\nAfter removing duplicate:");
//        for(int i=0;i<size;i++)
//        {
//            changedArr[i]=arr[i];
//        }
       var a1=new LinkedHashSet<Integer>();
        for(int i=0;i<size;i++) {
        	a1.add(arr[i]);
        	
        }
        System.out.println(a1);
        var a2=new TreeSet<Integer>(a1);
        System.out.println(a2);
        
        
    }
}