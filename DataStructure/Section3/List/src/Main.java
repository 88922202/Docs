/**
 * <h3></h3>
 * Created by root on 2016/11/3.
 */
public class Main {

    public static void main(String args[]){
        ArrayList testList = new ArrayList();

        testList.add(null);
        for (int i = 0; i < 10; i++){
            testList.add(i);
        }

        testList.remove(9);
        testList.add(6);
        for (int i = 0; i < testList.size(); i++){
            System.out.print(testList.get(i));
        }


        System.out.println();

        System.out.println(testList.indexOf(6));
        System.out.println(testList.lastIndexOf(6));

        //System.out.println(testList.size());
    }
}
