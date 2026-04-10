public class MergeSort {
    public static void main(String args[]){
        int arr []={1,5,4,6,2,7,3};
        mergeSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++) System.out.println(arr[i]);
    }
    public static void mergeSort(int arr[],int s,int e){
        int m= s+(s-e)/2 ;
        System.out.print("kkk");
        return mergeSort(arr,s,m);
        returmergeSort(arr, m+1, e);
        merge(arr,s,m,e);
        if(s>=e) return ;
    }
    public static void merge(int arr[],int s,int m,int e){
        int l1=m-s;
        int l2=e-m+1;
        int a1[]=new int [l1];
        int a2[]=new int [l2];
        for (int i =0;i<l1;i++) a1[i]=arr[i];
        for (int i=0 ;i < l2;i++) a2[i]=arr[i];
        int i =0,j=0,k=0;
        while (i<l1 || j<l2){
            if(a1[i] < a2[j]){
                arr[k]= a1[i];
                k++;
                i++;
            }
            else if (a1[i]> a2[j]){
                arr[k]=a2[j];
                j++;
                k++;
            }
        }
    }
}
