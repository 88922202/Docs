/**
 * <h3>《大话数据结构——第六章 树》</h3>
 * <p/>
 * <p>孩子兄弟表示法,树结点</p>
 * Created by Administrator on 2016/10/24.
 */
public class CSNode extends Node {
    //左孩子
    private int mLeftChild;

    //右兄弟
    private int mRightSib;

    public int getLeftChild() {
        return mLeftChild;
    }

    public void setLeftChild(int leftChild) {
        mLeftChild = leftChild;
    }

    public int getRightSib() {
        return mRightSib;
    }

    public void setRightSib(int rightSib) {
        mRightSib = rightSib;
    }
}
