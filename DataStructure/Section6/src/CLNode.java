/**
 * <h3>《大话数据结构——第六章 树》</h3>
 * <p/>
 * <p>孩子表示法，孩子链表结点</p>
 * Created by Administrator on 2016/10/24.
 */
public class CLNode {
    //孩子在数组中的位置
    private int mChild;

    //下一个孩子
    private CLNode mNext;

    public int getChild() {
        return mChild;
    }

    public void setChild(int child) {
        mChild = child;
    }

    public CLNode getNext() {
        return mNext;
    }

    public void setNext(CLNode next) {
        mNext = next;
    }
}
