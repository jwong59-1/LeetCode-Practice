class Solution {
    public int findJudge(int n, int[][] trust) {
        //we find one with "everybody" except judge (n-1)
        if (n == 1 && trust.length == 0) {
            return n;
        }
        int[] srcVertex = new int[n+1];
        int[] destVertex = new int[n+1];
        for (int[] person : trust) {
            srcVertex[person[0]] += 1;
            destVertex[person[1]] += 1;
        }
        //now locate the judge if it exists
        for (int i = 0; i < n+1; i++) {
            if (srcVertex[i] == 0 && destVertex[i] == n-1) {
                return i;
            }
        }
        return -1;
    }
    
}