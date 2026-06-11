class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left = 0
        best = 0 #this is what we return
        seen = set()

        for right in range(len(s)):
            while s[right] in seen:
                seen.remove(s[left])
                left += 1
            best = max(best, right - left + 1)
            seen.add(s[right])
        return best

        
        