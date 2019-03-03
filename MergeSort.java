public class MergeSort implements SortingAlgorithm {
    public void sort(int [] a){
        if (a.length > 1){ //base case; if more than one element is in the array,
            //recursively split the array & invoke merge sort on both halves

            int[] left = new int[a.length/2];
            System.arraycopy(a, 0, left, 0, left.length );
            int[] right = new int[a.length - left.length];
            System.arraycopy(a, left.length, right, 0, right.length);
            sort(left);
            sort(right);
            merge(a, left, right);
        }
    }

    //once two halves are sorted, merge is called
    //take 2 smaller sorted lists and combine them into a single, sorted, new list
    private void merge(int[] a, int[] left, int[] right){
        int ai = 0;
        int lefti = 0;
        int rightj = 0;

        while (lefti < left.length && rightj < right.length){
            if(left[lefti] <= right[rightj]){
                a[ai++] = left[lefti++]; //copy from left

            } else { //copy from right
                a[ai++] = right[rightj++];

            }
        }

        //copy all remaining elements into array a
        while (lefti < left.length){
            a[ai++] = left[lefti++];
        }
        while (rightj < right.length){
            a[ai++] = right[rightj++];
        }


    }


}
