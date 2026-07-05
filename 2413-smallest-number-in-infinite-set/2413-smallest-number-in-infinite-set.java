class SmallestInfiniteSet {
    private int curr;
    private PriorityQueue<Integer> minHeap;
    private Set<Integer> add;

    public SmallestInfiniteSet() {
        curr = 1; //simulates current untouched list
        minHeap = new PriorityQueue<>(); //this simulates any addedback numbers
        add = new HashSet<>(); //this tracks already added values
    }
    
    public int popSmallest() {
        if(!minHeap.isEmpty()) {
            int res = minHeap.poll();
            add.remove(res);
            return res;
        }
        return curr++;
    }
    
    public void addBack(int num) {
        if (num < curr && !add.contains(num)) {
            minHeap.offer(num);
            add.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */