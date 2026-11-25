class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        if n <=1:
            return s
        opt = [[0 for _ in range(n)] for _ in range(n)]

        for i in range(n):
            opt[i][i] = 1

        best = 0
        longest = 1
        for i in range(n-2,-1,-1):
            for j in range(i,n):
                if s[i] == s[j]:
                    if opt[i+1][j-1] == j - i - 1:
                        opt[i][j] = j - i + 1
                        if opt[i][j] > longest:
                            longest = opt[i][j]
                            best= i
                opt[i][j] = max(opt[i][j],opt[i][j-1],opt[i+1][j])
        return s[best:best+longest]

