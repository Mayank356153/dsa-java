
//u are given the n friends and u have find in how many ways they can be paired up 
// if there are 4 friend ABCD then there are two cases 
//1 Ais single then BCD can be paired either all single (B<C<D)or in pair (BC<BD<CD) i.e 4ways f(n-1)
// 2 Ais pair then it can pair with anyone like AB<AC<AD and 
//if AB then pairs are CD if AC then BD if AD then BC ways i.e 2 F(n-2) and for n-1 friends it will be (n-1)*f(n-2)


public class PairingPRoblem {
    public static void main (String args []){
        int n=4;
        int tw=calculateWays(n);
        System.out.print(tw);
    }
    static int calculateWays(int n){
          if(n==1 || n==2) return n;
          int single = calculateWays(n-1);
          int pair =(n-1)*calculateWays(n-2);

          //System.out.println(single+pair);
        return single+pair;
    }
}