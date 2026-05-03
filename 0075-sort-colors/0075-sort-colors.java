class Solution {
    public void sortColors(int[] nums) {
        //3 partition problem
        int n = nums.length;
        int low = 0, mid = 0, hi =n-1;

        while (mid <= hi) {
            if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid ++;
            } else if (nums[mid] == 2){
                swap(hi,mid,nums);
                hi--;
            }
        }
    }
    private void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}