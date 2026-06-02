class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length()-1;
        char[] word = s.toCharArray();
        while (l < r) {
            while (l < r && !isVowel(word[l])) {
                l++;
            }
            while (l < r && !isVowel(word[r])) {
                r--;
            }
            if (l < r) {
                char tmp = word[l];
                word[l] = word[r];
                word[r] = tmp;
                l++;
                r--;
            }
        }
        return new String(word);
    }
    private boolean isVowel(char c) {
        switch(c) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                return true;
            default:
                return false;
        }
    }
}