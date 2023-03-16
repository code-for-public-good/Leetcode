'''
Obvious implementation
Time Complexity: O(N^2)
Space complexity: O(1)
'''
class Solution(object):
    def maxProfit(self, prices):
        maxProfit = 0
        for buyIdx in range(len(prices)):
            for sellIdx in range(buyIdx+1, len(prices)):
                maxProfit = max(maxProfit, prices[sellIdx] - prices[buyIdx])
        return maxProfit


'''
Efficient implementation
Time Complexity: O(N)
Space complexity: O(1)
'''
class Solution(object):
    def maxProfit(self, prices):
        currLow = prices[0]
        maxProfit = 0
        for p in prices[1:]:
            if p < currLow:
                currLow = p
            else:
                maxProfit = max(maxProfit, p - currLow)
        return maxProfit