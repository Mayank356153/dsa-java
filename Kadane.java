public class Kadane {
    public static void main (String args[]){
          int arr[]={-2,-3,4,-1,-2,1,5,-3};
          int cs=0;int ms=Integer.MIN_VALUE;
          for (int i=0;i<arr.length;i++){
             cs=cs+arr[i];
             if(cs>ms) ms=cs;
             if(cs <0 ) cs=0;
          }
          System.out.println("Max sum"+ms);
    }
}
