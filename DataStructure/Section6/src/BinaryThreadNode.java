/**
 * <h3>《大话数据结构-第六章 树》</h3>
 * <p/>
 * <p>线索二叉树结点</p>
 * Created by Administrator on 2016/10/25.
 */
public class BinaryThreadNode<T> {
    private T mData;

    private boolean mLeftTag;

    private BinaryThreadNode<T> mLeftChild;

    private boolean mRightTag;

    private BinaryThreadNode<T> mRightChild;

    public T getData() {
        return mData;
    }

    public void setData(T data) {
        mData = data;
    }

    public boolean isLeftTag() {
        return mLeftTag;
    }

    public void setLeftTag(boolean leftTag) {
        mLeftTag = leftTag;
    }

    public BinaryThreadNode<T> getLeftChild() {
        return mLeftChild;
    }

    public void setLeftChild(BinaryThreadNode<T> leftChild) {
        mLeftChild = leftChild;
    }

    public boolean isRightTag() {
        return mRightTag;
    }

    public void setRightTag(boolean rightTag) {
        mRightTag = rightTag;
    }

    public BinaryThreadNode<T> getRightChild() {
        return mRightChild;
    }

    public void setRightChild(BinaryThreadNode<T> rightChild) {
        mRightChild = rightChild;
    }
}
