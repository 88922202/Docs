/**
 * <h3></h3>
 * Created by root on 2016/11/3.
 */
public class Main {

    public static void main(String args[]){
        ArrayList testList = new ArrayList();
        for (int i = 0; i < 10; i++){
            testList.add(i);
        }

        testList.remove(9);
        for (int i = 0; i < testList.size(); i++){
            System.out.print(testList.get(i));
        }

        //System.out.println(testList.size());
    }
}
