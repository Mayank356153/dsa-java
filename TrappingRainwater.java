public class TrappingRainwater {
       public static void main(String args[]){
        int height []={4,2,0,6,3,2,5};
        int ML[];
        ML=new int[height.length];
        int MR[];
        MR = new int[height.length];
        //Finding max left for each element 
        for (int i=0;i<height.length;i++){
            if(i==0){
                ML[i]=height[i];
                 continue;
            } 
            if(ML[i-1]<height[i]) ML[i]=height[i];
            else ML[i]=ML[i-1];
        }
        
        //finding max right of each element 
        for (int i=height.length-1;i>=0;i--){
            if(i==(height.length-1)){
                MR[i]=height[i];
                continue;
            }
            if(MR[i+1]<height[i]) MR[i]=height[i];
            else MR[i]=MR[i+1];
        }
        int t=0;
        for(int i=0;i<height.length;i++){
            t=t+(Math.min(ML[i],MR[i])-height[i]);
        }
        System.out.println("Total Water"+t);
       }
}
