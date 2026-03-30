public class TillingProblem {
     public static void  main (String args[]){
               int n=150;
               System.out.print(solve(n));
     }
     public static int solve(int n){
          if(n==0 || n==1) return 1;
          int v= solve(n-1);
          int h=0;
          if(n-2>=0) h=solve(n-2);
          return v+h;
     } 
}
