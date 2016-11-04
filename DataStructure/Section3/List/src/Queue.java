import java.util.Objects;

/**
 * <h3></h3>
 * Created by root on 2016/11/4.
 */
public interface Queue {

    boolean offer(Object o);

    Object poll();

    Object peek();
}
