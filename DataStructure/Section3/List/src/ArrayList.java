/**
 * <h3></h3>
 * Created by root on 2016/11/3.
 */
public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_SIZE = 1000;
    private int mSize;
    private Object mDatas[] = new Object[DEFAULT_SIZE];

    public ArrayList(){

    }

    @Override
    public int size() {
        return mSize;
    }

    @Override
    public void add(E e) {
        if (mSize < DEFAULT_SIZE){
            mDatas[mSize++] = e;
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public E remove(E e) {

        return null;
    }

    @Override
    public boolean isEmpty() {
        return mSize == 0;
    }

    @Override
    public void clear() {
        mDatas = new Object[DEFAULT_SIZE];
        mSize = 0;
    }
}
