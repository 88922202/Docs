/**
 * <h3>《大话数据结构——第六章 树》</h3>
 *
 * <p>双亲表示法，结点类</p>
 * Created by Administrator on 2016/10/24.
 */
public class PTNode<T> extends Node<T>{
    //双亲在数组中的位置
    private int mParent;

    public int getParent() {
        return mParent;
    }

    public void setParent(int parent) {
        mParent = parent;
    }
}
