//to find that all subset of  ag given string each character has two choice either to take take part in subset or 
// so we will call recursion one when character choice yes and other when character choice is no 


public class Subset {
     public static void main(String args[]){
        String a="abc";
        printSubset(a,"",0);
     }
     public static void printSubset(String a,String s,int i){
      if (i==a.length()){
         if(s.length()>0)
         System.out.println(s);
      else System.out.println("null");
         return;
      }

      //when character choice is yes
      printSubset(a, s+a.charAt(i), i+1);
      printSubset(a, s, i+1);

     }
}
