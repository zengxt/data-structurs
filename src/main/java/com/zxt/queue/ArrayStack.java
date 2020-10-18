package com.zxt.queue;

/**
 * 用数组来模拟实现一个栈
 * <p>
 * 在JDK的Stack中，推荐使用 Deque接口来实现栈的功能：
 * Deque<Integer> stack = new ArrayDeque<Integer>();
 * <p>
 * Stack类是继承 Vector 类的
 * class Stack<E> extends Vector<E>
 * <p>
 * 因此这里需要理解不管是栈还是队列都是线性表的数据结构，都可以使用数组来实现它，只不过不同的数据结构提供不同的操作接口
 */
public class ArrayStack {
    private int[] data;
    private int maxSize;
    private int top;

    ArrayStack() {
        data = new int[16];
        maxSize = 16;
        top = 0;
    }

    ArrayStack(int size) {
        data = new int[size];
        maxSize = size;
        top = 0;
    }

    // 入栈
    public boolean push(int value) {
        if (top < maxSize) {
            data[top++] = value;
            return true;
        }

        return false;
    }

    // 出栈
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空");
        }
        return data[--top];
    }

    public int peek() {
        return data[top - 1];
    }

    // 栈是否满
    public boolean isFull() {
        return top == maxSize;
    }

    // 栈是否为 null
    public boolean isEmpty() {
        return top == 0;
    }

    public void showStack() {
        if (isEmpty()) {
            throw new RuntimeException("栈空");
        }

        System.out.print("[");
        for (int i = top - 1; i > 0; i--) {
            System.out.print(data[i] + ",");
        }
        System.out.println(data[0] + "]");
    }
}
