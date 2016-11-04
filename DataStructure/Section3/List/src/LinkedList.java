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
        add(mSize, o);
        return true;
    }

    @Override
    public void add(int index, Object o) {
        if (index > mSize || index < 0){
            throw new IndexOutOfBoundsException();
        }

        if (mSize == 0) {
            mHead = new Entry(o, null, null);
        }

        Entry entry = getInternal(index - 1);
        entry.mNext = new Entry(o, entry, null);
        mSize++;
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
        mHead = null;
        mSize = 0;
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
        return getInternal(mSize);
    }

    private Entry getInternal(int index){
        Entry entry = mHead;
        for (int i = 0; i < index; i++){
            entry = entry.mNext;
        }

        return entry;
    }

    @Override
    public int indexOf(Object o) {
        Entry entry = mHead;
        int index = -1;
        while (entry != null){
            index++;
            if (entry.mData != null && entry.mData.equals(o)){
                return index;
            }
            entry = entry.mNext;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Entry entry = mHead;
        int index = -1;
        int lastIndex = -1;
        while (entry != null){
            index++;
            if (entry.mData != null && entry.mData.equals(o)){
                lastIndex = index;
            }
            entry = entry.mNext;
        }
        return lastIndex;
    }

    private static class Entry{
        private Object mData;
        private Entry mNext;
        private Entry mPrevious;

        Entry(Object data, Entry previous, Entry next){
            mData = data;
            mPrevious = previous;
            mNext = next;
        }
    }
}
