// You are given a square matrix maze[][] of size N × N representing a maze.

// Each cell contains either:
// 1 → open path (the rat can move here)
// 0 → blocked cell (cannot move)

// A rat starts from the top-left corner (0,0) and wants to reach the bottom-right corner (N-1, N-1).

// 🚶 Allowed Moves

// From any cell (i, j), the rat can move:

// Down (D) → (i + 1, j)
// Left (L) → (i, j - 1)
// Right (R) → (i, j + 1)
// Up (U) → (i - 1, j)
// ⚠️ Conditions
// The rat can only move to cells with value 1
// The rat cannot visit the same cell more than once in a single path
// The rat must stay within the bounds of the matrix



public class Mouse { 
   static int w =0;
    public static void main(String args[]){
        int m=4,n=4;
        int arr[][]={
            {1,1,1,1},
            {0,1,0,1},
            {1,1,1,1},
            {1,0,1,1}
        };
        ways(0,0,m,n,arr);
        System.out.print(w);
    }
    public static void ways(int i,int j,int m,int n,int arr[][]){
        if(i==m-1&&j==n-1){      
            w++;
            return;
        }
        if(i+1<m && arr[i+1][j+1]==1) ways(i+1,j,m,n,arr);
        if(j+1<n && arr[i+1][j+1]==1) ways(i,j+1,m,n,arr);
        if(j-1>=0 && arr[i+1][j+1]==1) ways(i,j-1,m,n,arr);
        if(i-1>=0 && arr[i+1][j+1]==1) ways(i-1,j,m,n,arr);
        return;
    }
    
}
