class Solution {
    public boolean isTrionic(int[] nums) {
        /* 3 steps:
       lets just do peaks and valleys
       we 2 pointer and iterate towards the middle
       l to r --> should be strictly increasing
       r to l --> strictly dec
       then, the middle should be strictly dec (from peak to valley)
       if so, true
        */
        int n = nums.length;
        int peak = -1, valley = n;
        for (int i = 0; i < n-1;i++) {
            //l to r (inc)
            if (peak == -1 && nums[i] >= nums[i+1]) {
                peak = i;
            }
            if (valley == n && nums[n-i-1] <= nums[n-i-2]) {
                valley = n-i-1;
            }
            if (peak != -1 && valley != n){
                break;
            }
        }
        if (peak < 1 || valley > n-2) {
            return false;
        }
        for (int j = peak; j < valley; j++) {
            if (nums[j] <= nums[j+1]) {
                return false;
            }
        }
        return true;
    }
}