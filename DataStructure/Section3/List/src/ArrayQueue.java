/**
 * <h3></h3>
 * Created by root on 2016/11/4.
 */
public class ArrayQueue implements Queue {

    private static final int DEFAULT_SIZE = 10;

    private int mSize;
    private Object mElements[];

    public ArrayQueue(){
        this(DEFAULT_SIZE);
    }

    public ArrayQueue(int capacity){
        mElements = new Object[capacity];
    }

    @Override
    public boolean offer(Object o) {
        if (mSize <= DEFAULT_SIZE){
            mElements[mSize++] = o;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object poll() {
        if (mSize == 0) {
            return null;
        }else if (mSize == 1){
            Object o = mElements[0];
            mElements[0] = null;
            mSize--;
            return o;
        }else  {
            Object o = mElements[0];
            System.arraycopy(mElements, 1, mElements, 0, mSize - 1);
            mSize--;
            return o;
        }
    }

    @Override
    public Object peek() {
        if (mSize == 0) {
            return null;
        }else {
            return mElements[0];
        }
    }
}
