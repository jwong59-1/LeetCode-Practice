class Solution {
    public int maxOperations(int[] nums, int k) {
        //create hashmap to count pairs
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        //iterate through, match the pairs
        for (int i = 0; i < nums.length; i++) {
            if (map.get(k-nums[i]) !=null && map.get(k-nums[i]) >= 1) {
                count++;
                //decrement
                map.put(k-nums[i],map.get(k-nums[i])-1);
            } else {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}