//u need to find all substring of given string and find number of string where first and last character are same 

public class StringMatching {
    public static void main(String args[]){
        String s="aba";
        System.out.print(number(0,1,s,0));
    }
    public static int number(int s,int e,String a,int n){
                       if(s==a.length()) return n;
                       
                        if(a.charAt(s)==a.charAt(e-1)){
                            
                            return number(e==a.length()?s+1:s,e==a.length()?s+2:e+1,a,n+1);
                        }
                       else  return number(e==a.length()?s+1:s,e==a.length()?s+2:e+1,a,n);
    }
}
