// You are given an integer array height of length n.

// There are n vertical lines drawn such that the two endpoints of the i-th line are at:

// (i, 0) and (i, height[i])
// 🎯 Task

// Find two lines that together with the x-axis form a container, such that the container holds the maximum amount of water.

// 👉 Return the maximum amount of water a container can store.


public class MostWater {
    public static void main(String[] args) {
        int height []={1,8,6,2,5,4,8,3,7};
        int f=0,s=height.length-1,maxw=Integer.MIN_VALUE;

        //in this complexity is o(n2)
        // for(int i=0;i<height.length;i++){
        //     for (int j=i+1;j<height.length;j++){
        //         if((Math.min(height[i],height[j])*(j-i))>maxw){
        //             maxw=(Math.min(height[i],height[j])*(j-i));
        //              f=i;
        //              s=j;
        //         }
        //     }
        // }

        //complexity is o(n)
        while(f<s){
            int current = Math.min(height[f],height[s])*(s-f);
            maxw=maxw>current ? maxw:current;
            if(height[f]<height[s]) f++;
            else s--;
        }


        
        System.out.print(maxw);
    }
}
