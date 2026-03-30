public class RemoveDuplicates {
   public static void main (String args[]){
         String a="aaapppnnnaaaccoll";
         StringBuilder s=new StringBuilder("");
         boolean ab[]=new boolean[26];
        for(int i=0;i<26;i++) ab[i]=false;
        System.out.print(removeD(ab, a, s, 0));

   } 
   public static StringBuilder removeD(boolean arr[],String o,StringBuilder s,int l){
         if(l>=o.length()) return s;
         char c = o.charAt(l);
         int p = (int)(c)-97;
        if(!arr[p]) {
            arr[p] =true;
            s.append(c);
        }
        return removeD(arr, o, s, l+1);
   }

}
