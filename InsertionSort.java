public class InsertionSort implements SortingAlgorithm {
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) { //Θ(n)
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) { //Θ(n)
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}
