class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0, r = 0,numZeros=0,ans = 0,curr = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                numZeros++;
                while (numZeros > 1) {
                    if (nums[l] == 0) {
                        numZeros--;
                    } 
                    else {
                        curr--;
                    }
                    l++;
                    }
                }
                else {
                    curr++;
                    ans = Math.max(curr,ans);
                }
                r++;
            }
            return (numZeros == 0) ? ans - 1 : ans;
        }
    }
