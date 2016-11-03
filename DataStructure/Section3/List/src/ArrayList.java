/**
 * <h3></h3>
 * Created by root on 2016/11/3.
 */
public class ArrayList implements List {
    private static final int DEFAULT_SIZE = 10;
    private int mSize;
    private Object mDatas[];

    public ArrayList(int initialCapacity){
        mDatas = new Object[initialCapacity];
    }

    public ArrayList(){
        this(DEFAULT_SIZE);
    }

    @Override
    public int size() {
        return mSize;
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity(mSize + 1);
        mDatas[mSize++] = o;

        return true;
    }

    private void ensureCapacity(int capacity){
        int oldCapacity = mDatas.length;
        if (capacity > oldCapacity){
            int newCapacity = oldCapacity * 3 / 2 + 1;
            if (newCapacity < capacity){
                newCapacity = capacity;
            }
            Object[] datas = new Object[newCapacity];
            System.arraycopy(mDatas, 0, datas, 0, oldCapacity);
            mDatas = datas;
        }
    }

    @Override
    public Object remove(Object e) {

        return null;
    }

    @Override
    public boolean isEmpty() {
        return mSize == 0;
    }

    @Override
    public void clear() {

        //mDatas = new Object[DEFAULT_SIZE];
        //JDK中使用了循环，而不是新创建一个数组，可能是这样效率更高.new 一个数组都做了什么工作?
        for (int i = 0; i < mSize; i++){
            mDatas[i] = null;
        }
        mSize = 0;
    }
}
