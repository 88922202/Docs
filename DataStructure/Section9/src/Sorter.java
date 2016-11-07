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
        for (int i = 0; i < datas.length; i++){
            for (int j = 0; j < i; j++){
                if (datas[i] < datas[j]){
                    int temp = datas[i];
                    for (int k = i; k > j; k--){
                        datas[k] = datas[k - 1];
                    }
                    datas[j] = temp;
                }
            }
        }
    }

    public void quickSort(int[] datas, int left, int right){

        if (left >= right){
            return;
        }

        int i = left + 1;
        int j = right;
        int base = datas[left];
        while (i != j) {
            while (datas[j] > base && i < j) {
                j--;
            }

            while (datas[i] < base && i < j) {
                i++;
            }

            int temp = datas[j];
            datas[j] = datas[i];
            datas[i] = temp;
        }

        datas[left] = datas[i];
        datas[i] = base;

        quickSort(datas, left, i - 1);
        quickSort(datas, i + 1, right);
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
