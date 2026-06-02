class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> seen = new HashMap<>();

        for (int num : arr) {
            seen.put(num,seen.getOrDefault(num,0)+1);
        }
        HashSet<Integer> s = new HashSet<>(); 
        for (int val : seen.values()) {
            if (s.contains(val)) {
                return false;
            }
            s.add(val);
        }
        return true;
    }
}