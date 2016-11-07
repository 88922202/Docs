/**
 * <h3></h3>
 * Created by root on 2016/11/7.
 */
public class Main {

    private static int mElements[] = {3, 25, 8, -9, 11, 7 ,31, 16, 22, 5, 8};

    public static void main(String args[]){
        Searcher searcher = new Searcher();
        int position = searcher.binarySearch(mElements, 0, mElements.length -1, 11);
        System.out.print(position);
    }
}
