import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                  arr[i][j]=sc.nextInt();
         for (int i=0;i<m;i++){
             for (int j=0;j<n;j++)
                     System.out.print(arr[i][j]+" ");
               System.out.println("");     
         }
                  

        int turns=Math.ceilDiv(m, 2),sr=0,er=m-1,stc=0,ec=n-1;
    
        while(sr<=er && stc<=ec){
            //top
            for(int j=stc;j<=ec;j++){
                System.out.print (arr[sr][j]+" ");
            }
            //right
            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }
            //bottom
            for(int j= ec-1;j>=stc;j--)
                System.out.print(arr[er][j]+" ");
            //left
            for (int i=er-1;i>sr;i--)
                System.out.print(arr[i][stc]+" ");
            sr++;
            er--;
            stc++;
            ec--;
            turns--;
        }
    }
}
