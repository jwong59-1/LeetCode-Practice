class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //monotonic increasing stack
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < n; i++) {
            int curr = temperatures[i];
            while (!temp.isEmpty() && temperatures[temp.peek()] < curr) {
                int past = temp.pop();
                ans[past] = i - past; 
            }
            temp.push(i);
        }
        return ans;
    }
}