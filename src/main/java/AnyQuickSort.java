import java.util.ArrayList;

/**
 * class is used to implement static generic method for sorting
 */
public class AnyQuickSort {


    /**
     *
     * @param arrayList sorted arraylist
     * @param <T> type
     */
    public static <T> void anyQuickSort(ArrayList<T> arrayList) {

        System.out.println("======QuickSort for ArrayList(using comparator)======");
        System.out.println("Source ArrayList:" +arrayList);

        MirComparator mirComparator=new MirComparator();
        arrayList.sort(mirComparator);

        System.out.println("Sorted ArrayList:");
        arrayList.forEach((n) -> System.out.println(n));
    }


}
