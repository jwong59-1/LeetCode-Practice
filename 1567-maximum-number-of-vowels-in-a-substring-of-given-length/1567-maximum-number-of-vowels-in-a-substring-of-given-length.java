class Solution {
    public int maxVowels(String s, int k) {
        int curr = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                curr += 1;
            }
        }
        int l = 0;
        int max_len = curr;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(l))) {
                curr -= 1;
            } 
            l += 1;
            if (isVowel(s.charAt(i))) {
                curr += 1;
            }
            max_len = Math.max(max_len,curr);
            if (max_len == k) {
                return max_len;
            }
        }
        return max_len;
    }
    public static boolean isVowel(char s) {
        if (s == 'a' || s == 'i' || s == 'o' || s == 'u' || s == 'e') {
            return true;
        }
        return false;
    }
}