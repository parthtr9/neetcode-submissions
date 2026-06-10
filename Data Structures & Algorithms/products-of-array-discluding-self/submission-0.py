class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #making two arrays - left(all the products of values to the left a number)
        #rigth(all the products of value to the right of a number)
        #initialize all the variables
        n = len(nums)
        left = [1] * n
        right = [1] * n
        answer = [1] * n

        #left array build
        for i in range(1, n):
            left[i] = left[i-1] * nums[i-1]
        
        #right array build
        for i in range(n-2,-1,-1):
            right[i] = right[i+1] * nums[i+1]

        #answer array build
        for i in range(n):
            answer[i] = left[i] * right[i]

        return answer