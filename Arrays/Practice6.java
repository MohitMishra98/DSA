package Arrays;
public class Practice6 {

    public static int maxProfit(int prices[]){
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            buyingPrice = Math.min(buyingPrice,prices[i]); 
            // sets the buying price to min
            // if current price is min

            int profit = prices[i] - buyingPrice;

            if(maxProfit < profit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {94,95,96,97,98,99}; // Math.max(98,99)

        System.out.println(maxProfit(prices));
    }
    
}
