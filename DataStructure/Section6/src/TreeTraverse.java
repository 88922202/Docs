import java.util.Scanner;

/**
 * <h3>《大话数据结构-第六章 树》</h3>
 * <p/>
 * <p>树的遍历</p>
 * Created by Administrator on 2016/10/25.
 */
public class TreeTraverse {

    public static void main(String args[]){
//        BinaryTreeNode<Integer> tree = createTree();
//        preOrderTraverse(tree);
//        inOrderTraverse(tree);
//        postOrderTraverse(tree);

        BinaryTreeNode<Integer> tree = preOrderCreateTree("12#3##4##");
        preOrderTraverse(tree);
    }

    /**
     * 前序遍历
     */
    private static void preOrderTraverse(BinaryTreeNode node){

        if (node.getData() != null) {
            System.out.println(node.getData());
        }

        if (node.getLeftChild() != null){
            preOrderTraverse(node.getLeftChild());
        }

        if (node.getRightChild() != null){
            preOrderTraverse(node.getRightChild());
        }
    }

    /**
     * TODO 前序遍历的循环算法
     */
    private static void preOrderTraverseByLoop(BinaryTreeNode node){
        System.out.println(node.getData());
        while (node.getLeftChild() != null){
            node = node.getLeftChild();
            System.out.println(node.getData());
        }
//        while (node.getRightChild() != null){
//            node = node.getRightChild();
//            System.out.println(node.getData());
//        }
    }

    /**
     * 中序遍历
     */
    private static void inOrderTraverse(BinaryTreeNode node){
        if (node.getLeftChild() != null){
            inOrderTraverse(node.getLeftChild());
        }

        System.out.println(node.getData());

        if (node.getRightChild() != null){
            inOrderTraverse(node.getRightChild());
        }
    }

    /**
     * 后序遍历
     */
    private static void postOrderTraverse(BinaryTreeNode node){
        if (node.getLeftChild() != null){
            postOrderTraverse(node.getLeftChild());
        }
        if (node.getRightChild() != null){
            postOrderTraverse(node.getRightChild());
        }

        System.out.println(node.getData());
    }

    /**
     * 以前序遍历的顺序创建一棵树
     */
    private static BinaryTreeNode<Integer> preOrderCreateTree(String input){
        if (input.length() < 2){
            return null;
        }

        BinaryTreeNode<Integer> node = new BinaryTreeNode<>();
        String first = input.substring(0, 1);
        if (!first.equals("#")){
            node.setData(Integer.parseInt(first));
            node.setLeftChild(preOrderCreateTree(input.substring(1, input.length())));
        }else {
            node.setRightChild(preOrderCreateTree(input.substring(1, input.length())));
        }

        return node;

    }

    /**
     * 中序遍历线索化
     */
    private void InThreading(BinaryThreadNode<Integer> node){
        if (node == null){
            return;
        }

        InThreading(node.getLeftChild());
        System.out.println(node.getData());
        InThreading(node.getRightChild());
    }


    private static BinaryTreeNode<Integer> createTree(){
        BinaryTreeNode<Integer> first = new BinaryTreeNode<>();
        first.setData(1);
        BinaryTreeNode<Integer> second = new BinaryTreeNode<>();
        second.setData(2);
        BinaryTreeNode<Integer> third = new BinaryTreeNode<>();
        third.setData(3);
        first.setLeftChild(second);
        first.setRightChild(third);
        BinaryTreeNode<Integer> forth = new BinaryTreeNode<>();
        forth.setData(4);
        BinaryTreeNode<Integer> fifth = new BinaryTreeNode<>();
        fifth.setData(5);
        third.setLeftChild(forth);
        third.setRightChild(fifth);

        return first;
    }
}
