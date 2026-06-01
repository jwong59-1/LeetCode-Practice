class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxNum = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            int left = 1;
            int right = 1;
            if (i == 0 || flowerbed[i-1] == 0) {
                left = 0;
            }
            if (i == flowerbed.length-1 || flowerbed[i+1] == 0) {
                right = 0;
            }
            if (left == 0 && right == 0 && flowerbed[i] == 0) {
                maxNum++;
                flowerbed[i] = 1;
            }
        }
        return maxNum >= n;
    }
}