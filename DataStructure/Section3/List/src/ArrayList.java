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
    public boolean remove(Object o) {
        boolean result = false;
        for (int i = 0; i < mSize; i++){
            if (mDatas[i] != null && mDatas[i].equals(o)){
                if (i != mSize - 1) {
                    System.arraycopy(mDatas, i + 1, mDatas, i, mSize - i);
                }
//                for (int j = i; j < mSize - 1; j++){
//                    mDatas[j] = mDatas[j + 1];
//                }
                mDatas[mSize - 1] = null;
                mSize--;
                result = true;
            }
        }
        return result;
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

    @Override
    public Object get(int index) {
        if (index >= mSize || index < 0){
            throw new IndexOutOfBoundsException();
        }

        return mDatas[index];
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < mSize; i++){
            if (mDatas[i] != null && mDatas[i].equals(o))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = mSize - 1; i >= 0; i--){
            if (mDatas[i] != null && mDatas[i].equals(o))
                return i;
        }
        return -1;
    }
}
