public class SelectionSort {
    public static void main(String args[]){
        int arr[]= {5,7,1,3,8};
        int min,temp;
        for (int i=0;i<arr.length-1;i++){
                min=i;
                int j=i;
                while(j<arr.length){
                    if(arr[min]>arr[j]) min =j;
                    j++;
                }
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}
