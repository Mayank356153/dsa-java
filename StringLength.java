// u need to find length of string without .length function

public class StringLength {
    public static void main (String args[]){
        String s="advf";
        System.out.print(calculateLEngth(0,s));
    }
    public static int calculateLEngth(int i,String s){
        try {
            char c=s.charAt(i);
        return    calculateLEngth(i+1, s);
        } catch (Exception e) {  
            return i;
        }
        
    }
}
