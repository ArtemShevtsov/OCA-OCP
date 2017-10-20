package com.epam.study.ocp.chapter7;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by artem_shevtsov on 8/4/17.
 */
public class LinkedBlockingDequeExample {
    public static void main(String[] args) {
        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));

            /*---------------*/

            System.out.println("\n");
            Queue<Integer> queue = new ArrayDeque<>();
            queue.offer(13);
            queue.offer(7);

            System.out.println(queue.poll());
            System.out.println(queue.peek());

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
        for(Integer item: list) {
            System.out.print(item+" ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size: "+list.size());
    }
}
