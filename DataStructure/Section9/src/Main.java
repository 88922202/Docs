/**
 * <h3></h3>
 * Created by root on 2016/11/4.
 */
public class Main {

    private static int mDatas[] = {3, 5, 0, 20, 12, -1, -7, 66, 12, 21};

    public static void main(String args[]){
        Sorter sorter = new Sorter();
//        sorter.bubbleSort1(mDatas);
//        for (int i = 0; i < mDatas.length; i++){
//            System.out.print(mDatas[i] + ",");
//        }
//        System.out.println();

//        sorter.bubbleSort2(mDatas);
//        for (int i = 0; i < mDatas.length; i++){
//            System.out.print(mDatas[i] + ",");
//        }
//        System.out.println();

//        sorter.bubbleSort3(mDatas);
//        for (int i = 0; i < mDatas.length; i++){
//            System.out.print(mDatas[i] + ",");
//        }
//        System.out.println();

        sorter.selectSort(mDatas);
        for (int i = 0; i < mDatas.length; i++){
            System.out.print(mDatas[i] + ",");
        }
        System.out.println();

//        sorter.insertSort(mDatas);
//        for (int i = 0; i < mDatas.length; i++){
//            System.out.print(mDatas[i] + ",");
//        }
//        System.out.println();

    }
}
