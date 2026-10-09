class Solution:
    def isPalindrome(self, s: str) -> bool:
        chars = [char.lower() for char in s if char.isalnum()]
        for i in range(len(chars)):
            if(chars[i]!=chars[len(chars)-i-1]):
                return False
        return True
        