class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        answer = set()
        nums.sort()

        for i in range(len(nums)):
            left = i + 1
            right = len(nums) - 1

            while left < right:
                target = nums[i] + nums[left] + nums[right]

                if target < 0:
                    left += 1
                elif target > 0:
                    right -= 1
                else:
                    answer.add((nums[i], nums[left], nums[right]))
                    right -= 1
                    left += 1
        return [list(x) for x in answer]