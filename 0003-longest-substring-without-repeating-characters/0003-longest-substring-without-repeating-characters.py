class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        arr = [0]*100
        l = 0
        longest = 0
        for i, letter in enumerate(s):
            if arr[ord(letter)-ord('a')] > 0:
                while arr[ord(letter)-ord('a')] > 0 and l < i:
                    arr[ord(s[l])-ord('a')] -= 1
                    l += 1
            arr[ord(letter)-ord('a')] += 1
            longest = max(longest,i-l+1)
        return longest

