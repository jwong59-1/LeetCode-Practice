class Solution {
    public int longestSubarray(int[] nums) {
        //track number of zeros
        int numZeros = 0,ans = 0,curr = 0;
        //l/r pointers
        int l = 0, r = 0;

        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (numZeros == 1) {
                    ans = Math.max(curr,ans);
                    curr -= (r-l);
                    l = r+1;
                }
                numZeros = 1;
                r = i;
            } else {
                curr++;
            }
        }
        ans = Math.max(curr,ans);
        return (numZeros == 0) ? ans-1: ans;
    }
}