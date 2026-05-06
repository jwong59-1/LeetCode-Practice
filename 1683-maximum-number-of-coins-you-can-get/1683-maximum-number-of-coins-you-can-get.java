class Solution {
    public int maxCoins(int[] piles) {
        //idea: need to take the 2nd largest pile every time.
        //for fun, I will implement loumuto sort?
        lomutoSort(piles,0,piles.length-1);
        int num_rounds = piles.length/3;
        int total = 0;
        int i = piles.length - 2;
        while (num_rounds > 0 && i > 0) {
            total += piles[i];
            num_rounds--;
            i -= 2;
        }
        return total;
    }
    //quicksort (Lomuto)
    public void swap(int[] arr, int a,int b) {
        int tem = arr[a];
        arr[a] = arr[b];
        arr[b] = tem;
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,high,++i);
        return i;
    }

    public void lomutoSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr,low,high);

            lomutoSort(arr,low,partition-1);
            lomutoSort(arr,partition+1,high);
        }
    }

}