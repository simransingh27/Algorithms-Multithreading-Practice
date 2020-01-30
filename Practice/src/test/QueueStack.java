package test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * These are the following cases:
 * 1 x: Enqueue element  into the end of the queue.
 * 2: Dequeue the element at the front of the queue.
 * 3: Print the element at the front of the queue.
 */

public class QueueStack {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1,42");
        list.add("2,0");
        list.add("1,14");
        list.add("3,0");
        list.add("1,28");
        list.add("3,0");
        list.add("1,60");
        list.add("1,78");
        list.add("2,0");
        list.add("2,0");

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1,92118642");
        list1.add("2,0");
        list1.add("1,107858633");
        list1.add("1,110186788");
        list1.add("1,883309178");
        list1.add("1,430939631");
        list1.add("2,0");
        list1.add("1,739711408");
        list1.add("1,803703507");
        list1.add("1,643797161");
        list1.add("1,538560826");
        list1.add("3,0");
        list1.add("1,595864615");
        list1.add("1,490282285");
        list1.add("1,558095366");
        list1.add("1,893666727");
        list1.add("1,595679828");
        list1.add("3,0");
        list1.add("1,99908215");

        List<String> output = queueStack(list);
        System.out.println("output : " + Arrays.asList(output));
        List<String> output1 = queueStack(list1);
        System.out.println("Output : " + Arrays.asList(output1));

    }

    public static List<String> queueStack(List<String> list) {
        Queue<Integer> queue = new LinkedList<Integer>();
        List<String> list1 = new ArrayList<String>();
        for (String lst : list) {
            String[] array = new String[list.size()];
            array = lst.split(",");
            if (array[0].equals("1")) {
                boolean b = queue.add(Integer.parseInt(array[1]));
            } else if (array[0].equals("2")) {
                queue.remove();
            } else if (array[0].equals("3")) {
                list1.add(Integer.toString(queue.peek()));
            }
        }
        return list1;
    }
}
