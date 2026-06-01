class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        maxbuy = 0

        for sell in prices:
            maxbuy = max(maxbuy, sell - buy)
            buy = min(buy, sell)
        return maxbuy

        