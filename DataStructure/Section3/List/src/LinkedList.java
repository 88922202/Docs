/**
 * <h3></h3>
 * Created by root on 2016/11/3.
 */
public class LinkedList implements List {

    private int mSize;
    private Entry mHead;

    public LinkedList(){

    }

    @Override
    public int size() {
        return mSize;
    }

    @Override
    public boolean add(Object o) {
        if (mSize == 0) {
            mHead = new Entry(o, null, null);
        }else {
            Entry entry = new Entry(o, null, null);
            tail().mNext = entry;
            entry.mPrevious = tail();
        }
        mSize++;
        return true;
    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return mSize == 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        if (index >= mSize || index < 0){
            throw new IndexOutOfBoundsException();
        }

        Entry entry = mHead;
        for (int i = 0; i < index; i++){
             entry = entry.mNext;
        }
        return entry.mData;
    }

    private Entry tail() {
        Entry entry = mHead;
        for (int i = 0; i < mSize - 1; i++){
            entry = entry.mNext;
        }
        return entry;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    private static class Entry{
        private Object mData;
        private Entry mNext;
        private Entry mPrevious;

        Entry(Object data, Entry next, Entry previous){
            mData = data;
            mNext = next;
            mPrevious = previous;
        }
    }
}
