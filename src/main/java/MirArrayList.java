/**
 * class shows user implemetation of ArrayList
 */

public class MirArrayList {

    /**
     * basic size of array
     */
    private final int BASIC_SIZE=8;
    /**
     * array container
     */
    private Object[] array = new Object[BASIC_SIZE];

    /**
     * amount of items in array
     */
    private int pointer=0;

    /**
     *
     * @param newLength new length of array
     * supporting method for scaling
     */
    public void resize(int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(array,0,newArray,0,pointer);
        array=newArray;

    }

    /**
     * @param item the item added to list
     * adding new element to list
     * when achieved basic size the size of array is being doubled
     */
    public void add(Object item) {
        if (pointer == array.length - 1) {
           resize(array.length*2);
        }
        array[pointer++]=item;
    }

    /**
     *
     * @param index index of item
     * @return item by index
     */
    public Object get(int index) {
        return (Object) array[index];
    }

    /***
     * @return the amount of items in the list
    */
    public int size(){
        return pointer;
    }


    /**
     *
     * @return all items
     */
    public Object[] getAll(){
       return array;
    }


    /**
     *
     * @param index index
     * method removes item by index
     * all items right from removed item are moving to the left
     */
    public void remove(int index) {
        for (int i = index; i<pointer; i++) {
            array[i] = array[i + 1];
        }
        array[pointer] = null;
        pointer--;

    }

}


