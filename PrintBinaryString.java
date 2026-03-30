// in this u need to print all binary string of size n without consecutive ones 
// in this if last bit is 0 then u can place 0,1 and if last bit is 1 then place 0 only


public class PrintBinaryString {
    public static void main(String args[]){
        int n=3;
        printBinaryString(n, 0, "");
    }
    public static void printBinaryString(int n,int l,String str){
        if(n==0){
            System.out.println(str); 
            return; 
        } 
        printBinaryString(n-1, 0, str+"0");
          if(l==0){
            printBinaryString(n-1, 1, str+"1");
          }
    }
}
