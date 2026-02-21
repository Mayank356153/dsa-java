public class BubbleSort{
    public static void main(String args[]){
        int arr[]={5,1,6,2,8,9,4};
        int l=arr.length;
        int t;
        for(int turn=0;turn<l-1;turn++){
            for(int swap=0;swap<l-1-turn;swap++){
                if(arr[swap]>arr[swap+1]){
                   t=arr[swap];
                   arr[swap]=arr[swap+1];
                   arr[swap+1]=t;
                }
            }
        }
        for(int i=0;i<l;i++) System.out.print(arr[i]+" ");
    }
}