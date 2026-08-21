class Solution {
    public int maxOperations(int[] nums, int k) {
        //two pointer
        //sort first
        Arrays.sort(nums);
        int count = 0;
        int i = 0, j = nums.length-1;

        while (i < j ){
            int sum = nums[i] + nums[j];
            if (k == sum) {
                count++;
                i++;
                j--;
            }
            //sum too big
            else if (k < sum) {
                j--;
            //sum too small
            } else {
                i++;
            }

        }
        return count;
    }
}