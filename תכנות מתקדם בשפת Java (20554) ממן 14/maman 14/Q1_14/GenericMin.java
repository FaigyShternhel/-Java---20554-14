/**
 * @author (Faigy Shternel)
 * @version (16.05.2022)
 */
import java.util.Iterator;

public class GenericMin<T extends Comparable<T>> {
    public T Minumum(Set<T> other) {
        T temp;
        T min = other.iterator().next();
        Iterator<T> itr = other.iterator();
        while (itr.hasNext()) {
            temp = itr.next();
            if (min.compareTo(temp) > 0) {
                min = temp;
            }
        }
        return min;
    }
}




