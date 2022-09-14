package day49_Collections_Continued;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {


        Queue<Integer> priorityQueue= new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("priorityQueue = " + priorityQueue);


        Queue<Integer> arrayDeque= new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("arrayDeque = " + arrayDeque);


        Queue<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("linkedList = " + linkedList);



        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);

        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);

        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);
        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);

        linkedList.poll();
        System.out.println("linkedList = " + linkedList);




    }
}
