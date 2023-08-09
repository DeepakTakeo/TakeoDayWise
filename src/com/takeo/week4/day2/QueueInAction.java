package com.takeo.week4.day2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInAction {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        // addition and removal of elements  //FIFO
        // 2,3,4,5,6,7,8
        queue.offer(2);  // add elements in queue // similar to add method of list
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        int removedElement  = queue.poll();  // remove element and return
        System.out.println(removedElement);

        // first elemeent in queue
        int firstElement = queue.peek();  // check first element in queue
        System.out.println(firstElement);

        System.out.println(queue.size());

    }
}
