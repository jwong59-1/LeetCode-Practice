class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[rooms.size()];
        int num_visit = 0;
        st.push(0);
        visited[0] = true;
        while (!st.isEmpty()) {
            int curr = st.pop();
            num_visit++;
            if (num_visit == rooms.size()) {
                return true;
            }
            List<Integer> cList = rooms.get(curr);
            for (int i : cList) {
                if (visited[i] == false) {
                    st.push(i);
                    visited[i] = true;
                }
            }
        }
        return false;
    }
}