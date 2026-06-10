class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        set_nums = set(nums)
        longest = 0 #this is what we will return
        for nums in set_nums:
            if nums - 1 not in set_nums:
                lenght = 1
                while nums+lenght in set_nums:
                    lenght += 1
                longest = max(longest, lenght)
        return longest