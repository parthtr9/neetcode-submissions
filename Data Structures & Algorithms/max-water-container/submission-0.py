class Solution:
    def maxArea(self, heights: List[int]) -> int:
        best = 0
        left = 0
        right = len(heights) - 1
        while left < right:
            curr = (right - left) * min(heights[left], heights[right])
            best = max(best, curr)
            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
        return best
        