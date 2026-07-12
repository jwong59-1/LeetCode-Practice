class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast = new Stack<>();
        for (int a : asteroids) {
            if (ast.isEmpty() || a > 0) {
                ast.push(a);
            }
            else {
                while (!ast.isEmpty() && ast.peek() > 0 && (Math.abs(a) > Math.abs(ast.peek()))) {
                    ast.pop();
                    } 
                if (ast.isEmpty() || ast.peek() < 0) {
                    ast.push(a);
                    }
                else if (Math.abs(a) == Math.abs(ast.peek())) {
                    ast.pop();
                    }
                }
            }
        int n = ast.size();
        int[] ans = new int[ast.size()];

        while (!ast.isEmpty()) {
            ans[n-1] = ast.pop();
            n--;
        }
        return ans;
    }
}