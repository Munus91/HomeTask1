import java.util.Comparator;

/**
 *  class implements comparator for 2 objects
 * @param <T> generic type
 */
public class MirComparator<T> implements Comparator<T> {

        /**
         *
         * @param item1 first compared item
         * @param item2 second compared item
         * @return te result of comparison
         */
        @Override
public int compare(T item1,T item2){

        if(item1 instanceof String&&item2 instanceof String)
        {
          if(((String)item1).length()==((String)item2).length())
          {
                  return 0;
          }
          if(((String)item1).length()>((String)item2).length())
          {
                  return 1;
          }
          else
          {
                  return-1;
          }

        }
        else if(item1 instanceof Integer&&item2 instanceof Integer)
        {
          if(((Integer)item1).intValue()==((Integer)item2).intValue())
         {
                  return 0;
         }
          if(((Integer)item1).intValue()>((Integer)item2).intValue())
          {
                  return 1;
          }
          else
          {
                  return-1;
          }

        }

        return 0;

        }

}


