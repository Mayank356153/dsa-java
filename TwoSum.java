// u are given an sorted and rotated array and u need to find the two index whose sum is equal to target
// [11,15,3,4,6,7] target=18


//two pointer approach 
public class TwoSum{
    public static void main(String args[]){
        int a[]={11,15,4,5,6,7};
        findTarget(a,20);
    }
    public static void findTarget(int a[],int t){
        int pivot=findPivot(a);
        int i=pivot+1,j=pivot;
        // while(i<a.length && j>=0){ //if i use this condition then 
        while(i<a.length && j>=0){
            int s= a[i]+a[j];
            if(s==t) {
                System.out.println(a[i]+" "+a[j]);
                return ;
            }
            else if(s<t) i++;
            else j--;
        }
    }

    public static int findPivot(int a[]){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]) return i;
        }
        System.out.println("Not a sorted and rotated array");
        System.exit(0);
        return -1;
    } 
    
}
