public class CountSort {
    public static void main(String args[]){
        int arr[]={1,5,4,6,1,2,2,3,5,5};
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) max=Math.max(max,arr[i]);
        max=max+1;
        int c[]=new int[max];
        for(int i=0;i<max;i++) c[i]=0;
        for(int i=0;i<arr.length;i++) c[arr[i]]+=1;
        int j=0;
        for(int i=0;i<max;i++){
            while(c[i]>0){
                arr[j]=i;
                j++;
                c[i]--;
            }
        }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");

    }
}
