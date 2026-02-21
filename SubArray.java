//brute - n3

public class SubArray {
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        int max=Integer.MIN_VALUE,c=0;;
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                c=0;
                for (int k=i;k<=j;k++){
                    c=c+arr[k];
                }
                max=max<c?c:max;
                
            }
        
        }
        System.out.println("Max"+max);
       
    }
}
