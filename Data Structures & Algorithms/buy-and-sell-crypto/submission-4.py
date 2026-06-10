class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minp = prices[0]
        best = 0

        for price in prices:
            minp = min(minp, price)
            best = max(best, price - minp)

        return best
        