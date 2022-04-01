/**
 * class implements quicksort for integer array
 */
public class IntQuickSort {

    /**
     * function sorts array
     * @param arr -sorted array
     * @param startIndex - start index
     * @param lastIndex  - last index
     */
    public static void quickSort(int arr[], int startIndex, int lastIndex) {
        if (startIndex < lastIndex) {
            int partitionIndex = partition(arr, startIndex, lastIndex);

            quickSort(arr, startIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, lastIndex);
        }

    }

    /**
     * function is used to divide array
     * @param arr - array
     * @param begin -left border
     * @param end   -right border
     * @return index of partition
     */
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end]; // стена
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

}



