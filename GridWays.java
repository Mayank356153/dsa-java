//u can move
 //only right and down in a grid and u need to find number of ways in which u can reacch destination //
//it can solve in linear time using formula (m-1+n-1)!/((n-1)!(m-1)!)

public class GridWays { 
   static int w =0;
    public static void main(String args[]){
        int m=10,n=50;
        ways(0,0,m,n);
        System.out.print(w);
    }
    public static void ways(int i,int j,int m,int n){
        if(i==m-1&&j==n-1){
            
            w++;
            return;
        }
        if(i+1<m) ways(i+1,j,m,n);
        if(j+1<n) ways(i,j+1,m,n);
        return;
    }
    
}
