package leetcode;

public class Best_Time_to_Buy_and_Sell_Stock_121 {
	
	
	public static void main(String[] args) {
		int a[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(a));
	}
	
	public static int maxProfit1(int[] prices) {
        int min = 0;
        for( int i = 0; i < prices.length -1; i++) {
        	for( int j = i+1; j < prices.length; j++) {
        		if( prices[i] - prices[j] < min) {
        			min = prices[i] - prices[j];
        		}
        	}
        }
        
        return Math.abs(min);
    }
	
	public static int maxProfit(int[] prices) {
		int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;        
    }
}
