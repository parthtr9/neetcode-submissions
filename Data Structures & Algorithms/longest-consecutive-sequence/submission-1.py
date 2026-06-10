class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        count = 0 #return this
        set_ = set(nums)

        for num in nums:
            if num - 1 not in set_:
                lenght = 1
                while num + lenght in set_:
                    lenght += 1
                count = max(count, lenght)
            
        return count

        