/**
 * <h3>《大话数据结构-第六章 树》</h3>
 * <p/>
 * <p>二叉树结点-二叉链表</p>
 * Created by Administrator on 2016/10/25.
 */
public class BinaryTreeNode<T> {
    private T mData;

    private BinaryTreeNode<T> mLeftChild;

    private BinaryTreeNode<T> mRightChild;

    public T getData() {
        return mData;
    }

    public void setData(T data) {
        mData = data;
    }

    public BinaryTreeNode<T> getLeftChild() {
        return mLeftChild;
    }

    public void setLeftChild(BinaryTreeNode<T> leftChild) {
        mLeftChild = leftChild;
    }

    public BinaryTreeNode<T> getRightChild() {
        return mRightChild;
    }

    public void setRightChild(BinaryTreeNode<T> rightChild) {
        mRightChild = rightChild;
    }
}
