class Solution {
    public int[] sortArray(int[] nums) {
        
        //bubbleSort(nums);
        heapSort(nums);
        return nums;
    }
    //heapsort
        public static void maxHeap(int[] nums,int n,int i) {
            int lchild = 2 * i + 1;
            int rchild = 2 * i + 2;

            int largest = i;
            //create maxheap
            if (lchild < n && nums[lchild] > nums[largest]) {
                largest = lchild;
            }

            if (rchild < n && nums[rchild] > nums[largest] ) {
                largest = rchild;
            }
            if (largest != i) {
                //swap
                int temp = nums[i];
                nums[i] = nums[largest];
                nums[largest] = temp;

                maxHeap(nums,n,largest);
            }
            
        }
    
        public void heapSort(int[] nums) {
            int n = nums.length;

            for (int i = n/2 - 1; i >= 0; i--) {
                //initialize maxheap by last parent onwards
                maxHeap(nums,n,i);
            }

            for (int i = n-1; i > 0; i--) {
                //swap farthest leaf node with max 
                int temp = nums[0];
                nums[0] = nums[i];
                nums[i] = temp;

                //reform maxheap discounting farthest leaf node.
                // as nums[i] is sorted
                maxHeap(nums,i,0);
            }
            
        }

        //Will include bubble sort
        public static void bubbleSort(int[] nums) {
            if (nums == null) return;
            for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length-1; j > i; j--) {
                    if (nums[j] < nums[j-1]) {
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                    }
                }
            }
        }
}