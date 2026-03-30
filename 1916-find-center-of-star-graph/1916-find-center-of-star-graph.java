class Solution {
    public int findCenter(int[][] edges) {
        //problem assumes that this is a valid star graph
        // we just need to check the first 2 edges
        int edgeA = edges[0][0], edgeB = edges[0][1]; //1st node
        int edgeC = edges[1][0], edgeD = edges[1][1]; //2nd node
        if (edgeA == edgeC || edgeA == edgeD) {
            return edgeA;
        }
        //check if edgeA is the center node
        else {
            return edgeB;
        }
    }
}