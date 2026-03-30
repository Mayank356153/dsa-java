package array;
//u are given an sorted matrix which is sorted both row-wise and column -wise and u nedd to find the particular elemenet 


// using staircase search 
 // O(m+n)
import java.util.*;
public class SortedSearchMatrix {
    public static void main(String args[]){
        int m,n;
        System.out.println("Enter elements");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter lement ");
        for (int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                 arr[i][j]=sc.nextInt();
         System.out.println("Enter key");
         int key=sc.nextInt();       
        sc.close();
        int sr=0,stc=n-1;
        while(stc>=0 && sr <= m-1){
            if(arr[sr][stc]==key){
                System.out.println("Found");
                System.exit(0);
            } 
            else if(arr[sr][stc]<key){
                sr++;
             }
             else{
                stc--;
             }
        }
        System.out.println("Not Found");
    }
}
