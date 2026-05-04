package array;
import java.util.*;
public class FourSum {
    public static void main(String args[]){
        int nums[]={1,0,-1,0,-2,2};
        ArrayList <Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++) a.add(nums[i]);
        fourSum(a, 0);
    }
     public static void fourSum(ArrayList<Integer> a, int target) {
        Collections.sort(a);
        System.out.println(a);
        return;
    }
}
