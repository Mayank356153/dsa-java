//u are given number and u need to convert them into string like 2019 - two zero one nine 

public class StringNumber {
    public static void main (String args[]){
        int n= 2548;
        
        String str []={"zero","one","two","three","four","Five","six","seven","eight","nine"};
    printString(n,str);
    }
    public static void printString(int n,String str[]){
        if(n<=0) return ;
         printString ( n / 10,str);
        System.out.print(str[n%10] + " ");
    }
}
