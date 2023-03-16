package leetcode.java;

/**
 * Obvious implementation
 * Time complexity: O(N^2)
 * Space complexity: O(1)   
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int buyIdx=0; buyIdx<prices.length; buyIdx++) {
            for (int sellIdx=buyIdx+1; sellIdx<prices.length; sellIdx++) {
                maxProfit = Math.max(maxProfit, prices[sellIdx] - prices[buyIdx]);
            }
        }
        return maxProfit;
    }
}


/**
 * Efficient implementation
 * Time complexity: O(N)
 * Space complexity: O(1)   
 */
class Solution {
    public int maxProfit(int[] prices) {
        
        int lowest = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price > lowest) {
                maxProfit = maxProfit > price - lowest ? maxProfit : price - lowest;
            } else {
                lowest = price;
            }
        }
        return maxProfit;
    }
}