class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double total = 0;
        for (int i = 0; i < k; i++) {
            total += nums[i];
        }
        double curr = total;
        for (int j = k; j < nums.length; j++) {
            curr = curr - nums[j - k] + nums[j];
            total = Math.max(total,curr);
        }
        return (double) total / k;
    }
}