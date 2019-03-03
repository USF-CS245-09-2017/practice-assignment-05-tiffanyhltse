public class QuickSort implements SortingAlgorithm {
    public void sort(int [] a){
        quickSort(a, 0, a.length-1);

    }
    
    public void quickSort(int[] a, int low, int high){
        if (high-low > 1){
            int pivot = partition(a, low, high);
            quickSort(a, low, pivot-1); //quick sort left of new pivot
            quickSort(a, pivot+1, high); //quick sort right of new pivot
        }

    }

    public int partition(int[] a, int low, int high){
        int pivot = low;
        int i = low+1;
        int j = high;

        while(i < j){
            while(i <= j && a[i] <= a[pivot] ){
                i++;
            }
            while (j >= i && a[j] > a[pivot]){
                j--;
            }
            if (i <= j){
                swap(a, i, j);
            }
        }
        swap(a, pivot, j); //when i & j cross; i > j
        return j;

    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
