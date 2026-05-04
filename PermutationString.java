// u need to print all possible combination of string using permutation 

public class PermutationString {
    public static void main(String args[]){
        printCombo("abc","");
    }
    public static void  printCombo(String s,String ans){
        if (s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            String ns= s.substring(0,i)+s.substring(i+1);
             printCombo(ns, ans+a);
        }
    }
}
