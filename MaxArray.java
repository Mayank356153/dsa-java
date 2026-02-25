
public class MaxArray{
    public static void main(String args[]){
        int arr []={1,-1,0,5,8,-9};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int p[];
        p=new int[arr.length];
        for (int i=0;i<arr.length;i++){
              p[i]=sum(arr,i);
        }

       for (int i=0;i<arr.length;i++){
              System.out.print(p[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
               for (int j=i;j<arr.length;j++){
                   int start =i ,end=j;
                   int sum=start==0?p[end]:p[end]-p[start-1];
                   if(sum>max) max=sum;
                   if(sum<min) min=sum;
               }
        } 
        System.out.println("\n max : "+max);
        System.out.println("min : "+min);
    }

      public static  int sum(int a[],int end){
        int s=0;
        for (int i=0;i<=end;i++){
            s=s+a[i];
        }
        return s;
    }
}