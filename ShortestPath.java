
public class ShortestPath {
     public static void main (String args[]){
        String str ="WNEENESENNN";
        int l= str.length();
        int x=0,y=0;
        for(int i=0;i<l;i++){
            char w=str.charAt(i);
            if(w=='N') y++;
            if(w=='S') y--;
            if(w=='E') x++;
            if(w=='W') x--;
        }
        double d=Math.sqrt((x*x)+(y*y));
        System.out.print(d);
     }
}
