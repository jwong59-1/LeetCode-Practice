class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = candies[0];
        List<Boolean> ans = new ArrayList<Boolean>();
        for (int candi : candies) {
            if (candi > maxCandy) {
                maxCandy = candi;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandy) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}