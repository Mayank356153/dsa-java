import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSumCloset {
    public static void main(String args[]){
         int arr[]={10,20,30,40,50,60,70,80,90};
        ArrayList <Integer> ar =new ArrayList<>();
        for(int i=0;i<arr.length;i++) ar.add(arr[i]);
        int i= threeSumClosest(ar,1);
        System.out.println(i);
    }
    public static int threeSumClosest(ArrayList <Integer> nums, int target) {
        Collections.sort(nums);
        //System.out.println(nums);
       int s = 0,d=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
            int j=i+1,k=nums.size()-1;
            while(j<k){
                int sum=(nums.get(i)+nums.get(j)+nums.get(k));
                int cd=Math.abs(target - sum);
                System.out.println(nums.get(i)+" "+nums.get(j)+" "+nums.get(k)+" "+cd);
                if(cd < d) {
                    s=(sum);
                    d=cd;
                }
                if(sum > target) k--;
                else j++;
            }
        }
        return s;
    }
}
