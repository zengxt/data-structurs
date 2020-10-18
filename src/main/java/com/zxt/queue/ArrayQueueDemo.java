package com.zxt.queue;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        System.out.println("queue is empty: " + queue.isEmpty());
        System.out.println("queue is full: " + queue.isFull());

        queue.add(5);
        queue.add(8);
        queue.add(3);
        System.out.println("queue size is: " + queue.size());
        System.out.println("queue head is: " + queue.poll());
        System.out.println("queue size is: " + queue.size());
        System.out.println("queue head is: " + queue.poll());
        System.out.println("queue size is: " + queue.size());
        System.out.println("queue head is: " + queue.peek());
        System.out.println("queue size is: " + queue.size());

        queue.add(10);
        queue.add(12);
        System.out.println("queue size is: " + queue.size());

        System.out.println("queue is full: " + queue.isFull());

        System.out.println(-1 & 15);
    }
}
