class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        
        left = 0
        need = {}
        window = {}

        for c in s1:
            need[c] = need.get(c, 0) + 1

        for right in range(len(s2)):
            window[s2[right]] = window.get(s2[right], 0) + 1

            while right - left + 1 > len(s1):
                window[s2[left]] -= 1
                if window[s2[left]] == 0:
                    del window[s2[left]]
                
                left += 1
            if window == need:
                return True
        return False