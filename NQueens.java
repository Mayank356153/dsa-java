//time complexity- o(n!)  
//t(n) = 1quuensplace*t(n-1) + issafe()
//why n! beacuse after each queen place there will choice for other queen in way n,n-1,n-2,n-2....1


import java.util.Scanner;

public class NQueens{
  static int w=0;
  static boolean b=false;
  public static void  main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char c[][]=new char[n][n];

    for(int i=0;i<c.length;i++)
      for(int j=0;j<c.length;j++) c[i][j]='.';
         
  
    printQueens(c,0);
    System.out.println("Total ways:"+w);
  }
  public static void printQueens(char c[][],int r){
    if(b){
      System.exit(0);
    }
    if(r==c.length){
      w++;
      print(c);
      b=true;
      return;
    }

    for(int cl=0;cl<c.length;cl++){
      if(isSafe(c,r,cl)) {
           c[r][cl]='Q';
         printQueens(c, r+1);    
         c[r][cl]='.'; 
      }
    }
    return ;
  }
  
  public static void print(char c[][]){
    System.out.println("-------------------------------");
    for(int i=0;i<c.length;i++){
      for(int j=0;j<c.length;j++){
        System.out.print(c[i][j]+" ");
      }
      System.out.println("");
    }
  }

  public static boolean isSafe(char c[][],int r,int cl){
    
    for(int i=r-1;i>=0;i--){
      //System.out.println(c[i][cl]+"-"+i+"-"+cl);
      if(c[i][cl]=='Q') return false; 
    }
    for(int i=r-1, j=cl-1;i>=0 && j>=0;i--,j--){
         if(c[i][j]=='Q') return false;
    }

     for(int i=r-1, j=cl+1;i>=0 && j<c.length;i--,j++){
         if(c[i][j]=='Q') return false;
    }

    return true;
  }
}