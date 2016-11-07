/**
 * <h3></h3>
 * Created by root on 2016/11/4.
 */
public class Sorter {

    public void bubbleSort1(int[] datas){
        for (int i = 0; i < datas.length - 1; i++){
            for (int j = i + 1; j < datas.length; j++){
                if (datas[i] > datas[j]){
                    int temp = datas[i];
                    datas[i] = datas[j];
                    datas[j] = temp;
                }
            }
        }
    }

    public void bubbleSort2(int[] datas){
        for (int i = 0; i < datas.length; i++){
            for (int j = 0; j < datas.length - i - 1; j++){
                if(datas[j] > datas[j + 1]){
                    int temp = datas[j];
                    datas[j] = datas[j + 1];
                    datas[j + 1] = temp;
                }
            }
        }
    }

//    public void bubbleSort3(int[] datas){
//        boolean sorted = false;
//
//        for (int i = 0; i < datas.length; i++){
//            for (int j = 0; j < datas.length - i - 1; j++){
//                if(datas[j] > datas[j + 1]){
//                    int temp = datas[j];
//                    datas[j] = datas[j + 1];
//                    datas[j + 1] = temp;
//                }
//            }
//        }
//    }

    public void selectSort(int[] datas){
        for (int i = 0; i < datas.length - 1; i++){
            int min = datas[i];
            int minPosition = i;
            for (int j = i + 1; j < datas.length; j++){
                if (min > datas[j]){
                    min = datas[j];
                    minPosition = j;
                }
            }
            datas[minPosition] = datas[i];
            datas[i] = min;
        }
    }

    public void insertSort(int[] datas){
        int temps[] = new int[datas.length];
        for (int i = datas.length - 1; i >=0; i--){
            for (int j = 0; j < temps.length; j++){
                if (datas[i] < temps[j]){
                    for (int k = temps.length - 2; k > j; k--) {
                        temps[k + 1] = temps[k];
                    }
                    temps[j] = datas[i];
                }
            }
        }

        //TODO 错误，修改了指向数组的指针，无论排序结果正确与否，对方法实参的待排序数组不会有任何影响。
        datas = temps;
    }

    public void quickSort(int[] datas){

    }

    public void shellSort(int[] datas){

    }

    public void mergeSort(int[] datas){

    }

    public void heapSort(int[] datas){

    }

    //目前不支持负数
    public void bucketSort(int[] datas){
        int max = datas[0];
        for (int i = 1; i < datas.length; i++){
            if (max < datas[i]){
                max = datas[i];
            }
        }

        int temps[] = new int[max];

        for (int i = 0; i < datas.length; i++){
            temps[datas[i]] += 1;
        }
    }
}
