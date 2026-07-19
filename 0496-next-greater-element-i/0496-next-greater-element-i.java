class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            int ans = -1;
            int target = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == target) {
                    found = true;
                }
                else if (found && nums2[j] > target) {
                    ans = nums2[j];
                    break;
                }
            }
            res[i] = ans;
        }    
        return res;
    }
}