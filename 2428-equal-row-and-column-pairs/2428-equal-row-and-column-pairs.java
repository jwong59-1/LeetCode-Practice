class Solution {
    public int equalPairs(int[][] grid) {
        //hash all pairs by row then column?
        // if hash val > 1, we add to stock?
        int stock = 0, n = grid.length;
        HashMap<List<Integer>,Integer> row_map = new HashMap();

        //now we slice and add arrays
        for (int i = 0; i < n;i++) {
            // row and col arrays
            List<Integer> row = new ArrayList<>();
            //row & col pointer is i
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            //add each array into the hashmap
            row_map.put(row,row_map.getOrDefault(row,0) + 1);
        }
        // count and return
        for (int col = 0; col < n; col++) {
            List<Integer> key = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                key.add(grid[k][col]);
            }
            stock += row_map.getOrDefault(key,0);
        }
        return stock;
    }
}