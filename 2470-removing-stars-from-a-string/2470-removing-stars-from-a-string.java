class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>(); 
        StringBuilder ans = new StringBuilder();

        for (char cha : s.toCharArray()) {
            if (cha == '*') {
                stack.pop();
            } else {
                stack.push(cha);
            }
        }
        for (char cha : stack) {
            ans.append(cha);
        }
        return ans.toString();
    }
}