/**
 * <h3></h3>
 * Created by root on 2016/11/3.
 */
public interface List {

    int size();

    boolean add(Object o);

    boolean remove(Object o);

    boolean isEmpty();

    void clear();

    Object get(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);
}
