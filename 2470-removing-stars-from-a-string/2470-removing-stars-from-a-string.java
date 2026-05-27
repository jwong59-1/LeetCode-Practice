class Solution {
    public String removeStars(String s) {
        //1 pointer
        StringBuilder ans = new StringBuilder();
        int l = 0;
        for (char cha : s.toCharArray()) {
            if (cha != '*') {
                ans.append(cha);
            } else {
                ans.setLength(ans.length() - 1);
            }
        }
        return ans.toString();
    }
}