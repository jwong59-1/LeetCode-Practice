class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[rooms.size()];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        st.push(0);
        while (!st.isEmpty()) {
            int curr = st.pop();
            visited[curr] = true;
            List<Integer> cList = rooms.get(curr);
            int len = cList.size();
            for (int i = 0; i < len; i++) {
                if (visited[cList.get(i)] == false) {
                    st.push(cList.get(i));
                }
            }
        }
        for (boolean i : visited) {
            if (!i) {
                return false;
            }
        }
        return true;
    }
}