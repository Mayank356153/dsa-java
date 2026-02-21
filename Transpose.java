import java.io.*;
import java.util.*;
public class Transpose {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int m,n;
        System.out.println("Enter size");
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter elements");
         for(int i=0;i<m;i++)
            for (int j=0;j<n;j++) arr[i][j]=sc.nextInt();
        
        int newarr[][] =new int [n][m];
        System.out.println("Matrix");
        for(int i=0;i<m;i++)
            {
                for (int j=0;j<n;j++) System.out.print(arr[i][j]+" ");
                System.out.println("");
            }
            System.out.println("Transpose Matrix");

        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++) System.out.print(arr[j][i]+" ");
            System.out.println("");
        }
    }
}
