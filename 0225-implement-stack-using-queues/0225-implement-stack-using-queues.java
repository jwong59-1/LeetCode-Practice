class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2; 
    public MyStack() {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        //goes all into queue1
        queue1.add(x);
    }
    
    public int pop() {
        //if queue2 is empty, we push all elems to q2 except the last one
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        //popped elem is the top of stack, back of queue
        int ans = queue1.remove(); 
        //now we swap. q1=q2, q2=q1, assuring we can keep pushing to q1
        Queue<Integer> dummy = queue1;
        queue1 = queue2;
        queue2 = dummy;
        return ans;
    }
    
    public int top() {
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int ans = queue1.peek();
        //once we peek, we transfer to q2
        queue2.add(queue1.remove());
        //then we swap q1 and q2
        Queue<Integer> dummy = queue1;
        queue1 = queue2;
        queue2 = dummy;
        return ans;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */