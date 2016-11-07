/**
 * <h3></h3>
 * Created by root on 2016/11/7.
 */
public class Searcher {

    public int binarySearch(int elements[], int left, int right, int toSearch){
        if (left >= right){
            if (elements[left] == toSearch){
                return left;
            }else {
                return -1;
            }
        }
        int partition = (right - left) / 2 + left;

        int a = binarySearch(elements, left, partition, toSearch);
        int b = binarySearch(elements, partition + 1, right, toSearch);

        if (a != -1){
            return a;
        }

        if (b != -1){
            return b;
        }

        return -1;

    }
}
