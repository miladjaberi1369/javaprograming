package Day40_collection;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random, dose not accept Null
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(queue1);
         int num1 =queue1.poll(); // return type is firs in first out

        System.out.println(queue1);
        System.out.println("-------------------------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // insertion order
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        System.out.println("--------------------------------------------------------------------------");


        Queue<Integer> queue3 = new LinkedList<>(); // order in same exact order and accept the null
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null, null, null, null));


        System.out.println(queue3);

        queue3.poll();
        System.out.println(queue3);


        System.out.println("=============================================");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list.get(1));

        ((LinkedList)list).poll(); // first in first out order
        System.out.println(list);

       // ((Stack)list).pop(); // last in first out order

        System.out.println(list);

    }
}
