package com.zxt.queue;

/**
 * 使用数组模拟一个队列
 */
public class ArrayQueue {
    private int maxSize;
    // 队列头
    private int front;
    // 队列尾
    private int tail;
    private int[] data;

    public ArrayQueue(int size) {
        this.maxSize = size;
        this.front = -1; // 指向队列头的前一个元素
        this.tail = -1; // 指向队列尾
        this.data = new int[maxSize];
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isFull() {
        return tail == maxSize - 1;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty() {
        return tail == front;
    }

    /**
     * 入队列
     * @return
     */
    public boolean add(int value) {
        if (isFull()) {
            throw new RuntimeException("队列已经满了，无法再添加！");
        }

        data[++tail] = value;
        return true;
    }

    /**
     * 出队列
     */
    public int poll() {
        if (isEmpty()) {
            throw new RuntimeException("队列已经空了，无法再取出！");
        }

        int value = data[++front];
        return value;
    }

    /**
     * 读取队列头部元素，不取出
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列已经空了，无法再读取！");
        }

        int value = data[front + 1];
        return value;
    }

    /**
     * 返回队列中元素个数
     * @return
     */
    public int size() {
        return tail - front;
    }
}
