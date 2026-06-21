class Solution {
    public int longestOnes(int[] nums, int k) {
        int  len = k, l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                len--;
            }
            if (len < 0) {
                if (nums[l] == 0) {
                    len++;
                }
                l++;
            }
        }
        return nums.length - l;
    }
}