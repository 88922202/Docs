/**
 * <h3>《大话数据结构——第六章 树》</h3>
 * <p/>
 * <p>孩子表示法，树结点</p>
 * Created by Administrator on 2016/10/24.
 */
public class CTNode<T> extends Node {
    //双亲在数组中的位置
    private int mParent;

    //左孩子；
    private CLNode mChild;

    public int getParent() {
        return mParent;
    }

    public void setParent(int parent) {
        mParent = parent;
    }

    public CLNode getChild() {
        return mChild;
    }

    public void setChild(CLNode child) {
        mChild = child;
    }
}
