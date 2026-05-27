class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0, r = 0;
        StringBuilder ans = new StringBuilder("");
        while (l < word1.length() && r < word2.length()) {
            if (l <= r ) {
                ans.append(word1.charAt(l++));
            } else {
                ans.append(word2.charAt(r++));
            }
        }
        while (l < word1.length()) {
            ans.append(word1.charAt(l++));
        }
        while (r < word2.length()) {
            ans.append(word2.charAt(r++));
        }
        return ans.toString();
    }
}