class Solution {
    public int equalPairs(int[][] grid) {
        //hash all pairs by row then column?
        // if hash val > 1, we add to stock?
        int stock = 0, n = grid.length;
        HashMap<List<Integer>,Integer> row_map = new HashMap();
        HashMap<List<Integer>,Integer> col_map = new HashMap();

        //now we slice and add arrays
        for (int i = 0; i < n;i++) {
            // row and col arrays
            List<Integer> row = new ArrayList<>();
            List<Integer> col = new ArrayList<>();
            //row & col pointer is i
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
                col.add(grid[j][i]);
            }
            //add each array into the hashmap
            row_map.put(row,row_map.getOrDefault(row,0) + 1);
            col_map.put(col,col_map.getOrDefault(col,0) + 1);
        }
        // count and return
        for (Map.Entry<List<Integer>, Integer> entry : row_map.entrySet()) {
            List<Integer> key = entry.getKey();
            int freq = entry.getValue();
            if (col_map.get(key) != null) {
                stock += col_map.get(key)*freq;
            }
        }
        return stock;
    }
}