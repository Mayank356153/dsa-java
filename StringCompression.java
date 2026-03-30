public class StringCompression {
    public static void main (String args[]){
        String str="aaabbcccdd";   // output be "a4b3f3r3t2y"
        StringBuilder s=new StringBuilder("");
        int l=str.length();
        
        int i=0,j,count;
        while(i<l){
            j=i;
            count=0;
            char c=str.charAt(i);
            while( j<l && c==str.charAt(j)){
              
               count++;
               j++;
            }
            if(count>1) s.append(c+String.valueOf(count));
            else s.append(c);
            if(j==l) break;
            else i=j;
        }
        System.out.println(6 & 1);
    }
}

