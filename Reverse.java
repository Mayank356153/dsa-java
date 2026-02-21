import java.io.*;
import java.util.*;


public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Size");
        int l=sc.nextInt();
        int arr[] =new int[l];

        System.out.println("Enter number");
        for(int i=0;i<l;i++)
            arr[i]=sc.nextInt();
        int s=0;
        l--;
        while(s<l){
            int a=arr[s];
            arr[s]=arr[l];
            arr[l]=a;
            s++;
            l--;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);

    }
}
