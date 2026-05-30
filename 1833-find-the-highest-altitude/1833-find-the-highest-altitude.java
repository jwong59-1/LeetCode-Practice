class Solution {
    public int largestAltitude(int[] gain) {
        int maxGain = 0, currGain = 0;
        for (int num : gain) {
            currGain = currGain + num;
            maxGain = Math.max(maxGain, currGain);
        }
        return maxGain;
    }
}