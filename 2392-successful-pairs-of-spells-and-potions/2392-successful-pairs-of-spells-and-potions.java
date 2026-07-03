class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        //sort the potions for binary search
        Arrays.sort(potions);
        int n = potions.length,s = spells.length;
        //output array
        int[] pairs = new int[s];
        //loop through spells, and binary search potions
        for (int i = 0; i < s; i++) {
            int l = 0, r = n-1, midIdx = -2; //midIdx will either return 0 at the end or be the partition for succeessful potions
            //int is too smol
            long spell = spells[i];
            while (l <= r) {
                int mid = (l+r)/2;
                if (spell*potions[mid] >= success) { //case where we have at least 1 successful potion
                    midIdx = mid; //this is our partition
                    r = mid - 1; //attempt to find a lower partition
                }
                else {
                    l = mid + 1; //increase partition placement
                }
            }
            if (midIdx == -2) {
                pairs[i] = 0;
            }
            else {
                pairs[i] = n - midIdx;
            }
        }
        return pairs;
    }
}