class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minprice = prices[0]
        best = 0 #this is what we return

        for price in prices:
            minprice = min(price, minprice)
            best = max(best, price - minprice)
        return best
        