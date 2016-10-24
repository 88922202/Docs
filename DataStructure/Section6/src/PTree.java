/**
 * <h3>《大话数据结构——第六章 树》</h3>
 * <p/>
 * <p>双亲表示法，树类</p>
 * Created by Administrator on 2016/10/24.
 */
public class PTree<T> extends AbstractTree{

    private static final int MAX_SIZE = 100;

    //结点数组
    private PTNode<T> nodes[] = new PTNode[MAX_SIZE];

    //根结点的位置
    private int root = -1;

    //结点数
    private int size = 0;

    @Override
    public AbstractTree initTree() {
        return new PTree<>();
    }

    @Override
    public void destroyTree() {
        root = -1;
        size = 0;
        for (PTNode<T> eachNode : nodes){
            eachNode = null;
        }
    }

    @Override
    public boolean emptyTree() {
        return size > 0;
    }

    @Override
    public Node parent(int current) throws InvalidIndexException{
        if (current < 0 || current >= size){
            throw new InvalidIndexException();
        }
        int parentIndex = nodes[current].getParent();
        if (parentIndex == -1){
            //根结点
            return nodes[0];
        }
        //非根结点
        return nodes[parentIndex];
    }

    @Override
    public Node leftChild(int current) throws InvalidIndexException {
        if (current < 0 || current >= size){
            throw new InvalidIndexException();
        }
        //从当前结点开始，向后遍历，遇到第一个（父结点是当前结点）的结点，则返回
        for (int i = current + 1; i < size; i++){
            int parentIndex = nodes[i].getParent();
            if (parentIndex == current){
                return nodes[i];
            }
        }
        //否则，没有左孩子
        return null;
    }


}
