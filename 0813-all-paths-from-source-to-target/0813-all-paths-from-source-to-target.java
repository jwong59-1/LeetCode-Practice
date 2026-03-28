class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
    
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfsSearch(graph,0,res,path);
        return res;
        }
        private void dfsSearch(int[][] graph, int node,List<List<Integer>> res, List<Integer> path) {
            if (node == graph.length - 1) {
                res.add(path);
                return;
            }
            for (int child : graph[node]) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(child);
                dfsSearch(graph,child,res,newPath);
            }
        }
    }
