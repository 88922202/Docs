/**
 * <h3>《大话数据结构——第六章 树》</h3>
 * <p/>
 * <p>双亲表示法，带有左孩子位置的结点类</p>
 * Created by Administrator on 2016/10/24.
 */
public class PTNodeExt extends PTNode {
    //当前结点的左孩子
    private int firstChild;

    public int getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(int firstChild) {
        this.firstChild = firstChild;
    }
}
