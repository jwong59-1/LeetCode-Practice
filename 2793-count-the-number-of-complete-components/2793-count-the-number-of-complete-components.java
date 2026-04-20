class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int[] parent = new int[n];

        //count number of edges
        int[] edgeCount = new int[n];

        //initialize parent set
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
        //unionize edges array
        for (int[] edge : edges) {
            union(edge[0],edge[1],parent);
        }
        //now tally up all the edges per compenent by root
        for (int[] edge : edges) {
            int root = find(edge[0],parent);
            edgeCount[root]++;
        }
        int ans = 0;
        //now use the formula provided
        for (int j = 0; j < n; j++) {
            //looking for root nodes only
            if (parent[j] >= 0) {
                continue;
            } 
            int size = -parent[j];
            int req = size*(size-1)/2;
            if (edgeCount[j] == req) {
                ans++;
            }
        }
        return ans;
    }
    public int find(int x,int[] parent) {
        while(parent[x] >= 0) {
            x = parent[x];
        }
        return x;
    }
    //modified: add # nodes instead of levels
    public void union (int x, int y, int[] parent) {
        int px = find(x,parent);
        int py = find(y,parent);

        if (px == py) {
            return;
        } else if (parent[px] < parent[py]) {
            parent[px] += parent[py];
            parent[py] = px;
        } else {
            parent[py] += parent[px];
            parent[px] = py;
           
        }
    } 
}