//sort array using recursion

public class SortedArray {
     public static void main(String args[]){
        int arr[]={1,2,3,4,5,8,12};
        boolean a=sorteds(arr,0,true);
        
        System.out.print(a);
     }
      public static boolean sorteds(int ar[],int p,boolean r){
        // System.out.print(p+" "+r);
        // System.out.println("");
        if(r==false) return false;
        if(p==ar.length-1) return r;
        return sorteds(ar, p+1,p<=ar.length-2? ar[p]<ar[p+1]?true:false:r);
        // if(p==ar.length-2 && ar[p]<ar[p+1]) return true;
        // else return false;
       
     }
}