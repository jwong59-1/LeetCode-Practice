class Solution {
    public boolean closeStrings(String word1, String word2) {
        //operation 1 means order does not matter
        //op 2 means thats both words ahve the same letters
        //we just care about freq amts
        //maybe freq counter?
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char l : word1.toCharArray()) {
            arr1[(l-'a')]++;
        }
        for (char l : word2.toCharArray()) {
            arr2[(l-'a')]++;
        }
        //check op 2 same letters:
        for (int i = 0; i < 26; i++) {
            if (arr1[i] == 0 && arr2[i] == 0) {
                continue;
            }
            if (arr1[i] == 0 || arr2[i] == 0) {
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //check for freqs
        for (int i =0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}