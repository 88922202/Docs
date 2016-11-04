import java.util.EmptyStackException;
import java.util.Objects;

/**
 * <h3></h3>
 * Created by root on 2016/11/4.
 */
public class ArrayStack implements Stack{
    private static final int DEFAULT_SIZE = 10;

    private Object mDatas[];
    private int mSize;

    public ArrayStack(){
        mDatas = new Object[DEFAULT_SIZE];
    }


    @Override
    public void push(Object o) {
        ensureCapacity(mSize + 1);
        mDatas[mSize++] = o;
    }

    @Override
    public Object pop() {
        if (mSize <= 0){
            throw new EmptyStackException();
        }
        return mDatas[mSize-- - 1];
    }

    @Override
    public boolean isEmpty() {
        return mSize == 0;
    }

    private void ensureCapacity(int capacity){
        if (capacity > DEFAULT_SIZE){
            int newCapacity = DEFAULT_SIZE * 2;
            if (newCapacity < capacity){
                newCapacity = capacity;
            }
            Object datas[] = new Object[newCapacity];
            System.arraycopy(mDatas, 0, datas, 0, mSize);
            mDatas = datas;
        }
    }
}
