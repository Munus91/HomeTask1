import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * class Main is used for demonstration
 * it includes static methods to show different cases

 */

public class Main {

    /**
     * method demonstrates quicksort of integer array
     */
    public static void intArrayQuickSort(){
        System.out.println("======Quick sort for int array======");
        int[] arr={3,1,2,5,4,7,6};
        System.out.println("Given array:"+ Arrays.toString(arr));
        IntQuickSort.quickSort(arr,0,arr.length-1);
        System.out.println("Sorted array:"+ Arrays.toString(arr));

    }

    /**
    * method main is used for demonstration
     */

    public static void main (String[] args) {

        /**
         * sorting simple integer array by quicksort
         */
        intArrayQuickSort();

        /**
         * sorting ArrayList of String objects
         */
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList,"Elephant","Cat","Mouse","Veloceraptor");

        AnyQuickSort.anyQuickSort(stringArrayList);

        /**
         * sorting ArrayList of Integer objects
         */
        ArrayList<Integer> integerArrayList= new ArrayList<>();
        Collections.addAll(integerArrayList, 4, 1, 3, 5, 2);

        AnyQuickSort.anyQuickSort(integerArrayList);

        /**
         * Demonstrating ArrayList user realization
         */

        System.out.println("======Demonstrating ArrayList user realization======");

        MirArrayList mirArrayList = new MirArrayList();

        mirArrayList.add(1);
        mirArrayList.add(2);
        mirArrayList.add(3);

        mirArrayList.remove(2);

        System.out.println("MirArraylist elements:"+ Arrays.toString(mirArrayList.getAll()));
        System.out.println("MirArraylist size:"+ mirArrayList.size());

    }
}

