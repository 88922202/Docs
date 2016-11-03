/**
 * <h3></h3>
 * Created by root on 2016/11/3.
 */
public interface List<E> {

    int size();

    void add(E e);

    E remove(E e);

    boolean isEmpty();

    void clear();
}
