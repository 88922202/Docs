/**
 * <h3>《大话数据结构——第六章 树》</h3>
 *
 * <p>抽象树操作</p>
 * Created by root on 2016/10/24.
 */
public abstract class AbstractTree {

    public static final int PTREE = 0;

    /**
     * 创建一棵空树
     */
    public abstract AbstractTree initTree();

    /**
     * 销毁一棵树
     */
    public abstract void destroyTree();

    /**
     * 返回一棵树是否是空树
     */
    public abstract boolean emptyTree();

    /**
     * 返回一个结点的双亲结点
     */
    public abstract Node parent(int current) throws InvalidIndexException;

    /**
     * 返回当前结点的左孩子
     */
    public abstract Node leftChild(int current) throws InvalidIndexException;

}
