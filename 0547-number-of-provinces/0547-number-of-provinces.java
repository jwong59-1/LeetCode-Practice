class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int ans = 0;
        for (int j = 0; j < isConnected.length; j++) {
            if (!visited[j]) {
                dfs(j,visited,isConnected);
                ans++;
            }
        }
        return ans;
    }
    private void dfs(int node,boolean[]visited,int[][] isConnected) {
        visited[node] = true;
        for (int i = 0; i < isConnected[node].length; i++) {
            int connect = isConnected[node][i];
            if (connect == 1 && !visited[i]) {
                dfs(i,visited,isConnected);
            }
        }
    }
}