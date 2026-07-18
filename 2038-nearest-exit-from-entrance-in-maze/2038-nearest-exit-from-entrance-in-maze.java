class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length;
        int m = maze[0].length;
        //di = directions
        int[][] di = {{1,0},{-1,0},{0,1},{0,-1}};

        Queue<int[]> bfs = new ArrayDeque<>();

        //input x,y coor, pathsum
        bfs.offer(new int[] {entrance[0],entrance[1],0});
        //wall off explored routes
        maze[entrance[0]][entrance[1]] = '+';

        while(!bfs.isEmpty()) {
            int [] curr = bfs.poll();
            int row = curr[0];
            int col = curr[1];
            int dist = curr[2];
            for (int[] d : di) {
                int x = row + d[0];
                int y = col + d[1];
                
                // not paths
                if (x == -1 || y == -1 || x == n || y == m) {continue;}
                if (maze[x][y] == '+') { continue;}
                //if reached edge of maze
                if (x == 0 || y == 0 || x == n-1 || y == m-1) {return dist + 1;}
                maze[x][y] = '+';
                bfs.offer(new int[] {x,y,dist+1});

            }
        }
        return -1;
    }
}