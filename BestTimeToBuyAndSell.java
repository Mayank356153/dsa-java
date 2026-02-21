public class BestTimeToBuyAndSell {
    public static void main(String args[]){
         int prices []= {2,4,1};
         int min_price=prices[0];
         int max_p=0;
         for(int i=0;i<prices.length;i++){
             int p=prices[i]-min_price;
                max_p=Math.max(max_p, p);

                min_price=min_price<prices[i]?min_price:prices[i];
         }
         System.out.println(max_p);
         
    }
}
