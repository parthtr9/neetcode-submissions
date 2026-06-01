class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0:
            return 0
        if n == 1:
            return nums[0]
        
        dp = [0]*(n+1)
        dp[0] = nums[0]
        dp[1] = max(nums[0],nums[1])

        for x in range (2,n):
            dp[x] = max((dp[x-2]+nums[x]), dp[x-1])
        
        return dp[n-1]
