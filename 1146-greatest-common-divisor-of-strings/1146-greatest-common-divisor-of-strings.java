class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String lr = str1 + str2;
        String rl = str2 + str1;

        if (lr.equals(rl)) {
            int gcd = gcd(str1.length(),str2.length());
            return str1.substring(0,gcd);
        }
        return ""; 
    }
     private int gcd(int len1, int len2) {
            while (len1 != 0 && len2 != 0) {
                int tmp = len1 % len2;
                len1 = len2;
                len2 = tmp;
            }
            return len1;
        }
}