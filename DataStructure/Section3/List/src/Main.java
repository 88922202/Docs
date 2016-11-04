/**
 * <h3></h3>
 * Created by root on 2016/11/3.
 */
public class Main {

    public static void main(String args[]){
//        ArrayList testList = new ArrayList();
//
//    //    testList.add(null);
//        for (int i = 0; i < 10; i++){
//            testList.add(i);
//        }
//
//        Integer result = (Integer) testList.remove(4);
//        testList.add(6);
//        for (int i = 0; i < testList.size(); i++){
//            System.out.print(testList.get(i));
//        }
//
//
//        System.out.println();
//
//        System.out.println(testList.indexOf(6));
//        System.out.println(testList.lastIndexOf(6));
//        System.out.println(result);
//
//        //System.out.println(testList.size());
//
//        People people = new People();
//        people.age = 20;
//        changeValue(people);
//        System.out.println(people.age);

//        LinkedList linkedList = new LinkedList();
//        for (int i = 0; i < 10; i++){
//            linkedList.add(i);
//        }
//
//        //linkedList.add(4);
//
//        System.out.println(linkedList.get(6));
//        System.out.println(linkedList.indexOf(4));
//        System.out.println(linkedList.lastIndexOf(4));
//
//        linkedList.remove(0);
//        for (int i = 0; i < linkedList.size(); i++){
//            System.out.print(linkedList.get(i));
//        }

//        Stack stack = new ArrayStack();
//        for (int i = 0; i < 15; i++){
//            stack.push(i);
//        }
//
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

        Queue queue = new ArrayQueue(10);
        for (int i = 0; i < 10; i++){
            queue.offer(i);
        }

        while (queue.peek() != null){
            System.out.print(queue.poll());
        }
    }

    private static void changeValue(People people){
        people.age = -1;
    }
}
