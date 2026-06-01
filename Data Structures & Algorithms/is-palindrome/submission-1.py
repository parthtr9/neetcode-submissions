class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        s = re.sub(r'[^a-zA-Z0-9]', '', s)
        j = len(s) - 1
        for i in range(len(s)):
            if s[i] != s[j]:
                return False
            j = j - 1
        return True
        