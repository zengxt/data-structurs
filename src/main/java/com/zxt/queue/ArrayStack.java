package com.zxt.queue;

/**
 * ��������ģ��ʵ��һ��ջ
 * <p>
 * ��JDK��Stack�У��Ƽ�ʹ�� Deque�ӿ���ʵ��ջ�Ĺ��ܣ�
 * Deque<Integer> stack = new ArrayDeque<Integer>();
 * <p>
 * Stack���Ǽ̳� Vector ���
 * class Stack<E> extends Vector<E>
 * <p>
 * ���������Ҫ��ⲻ����ջ���Ƕ��ж������Ա�����ݽṹ��������ʹ��������ʵ������ֻ������ͬ�����ݽṹ�ṩ��ͬ�Ĳ����ӿ�
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

    // ��ջ
    public boolean push(int value) {
        if (top < maxSize) {
            data[top++] = value;
            return true;
        }

        return false;
    }

    // ��ջ
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("ջ��");
        }
        return data[--top];
    }

    public int peek() {
        return data[top - 1];
    }

    // ջ�Ƿ���
    public boolean isFull() {
        return top == maxSize;
    }

    // ջ�Ƿ�Ϊ null
    public boolean isEmpty() {
        return top == 0;
    }

    public void showStack() {
        if (isEmpty()) {
            throw new RuntimeException("ջ��");
        }

        System.out.print("[");
        for (int i = top - 1; i > 0; i--) {
            System.out.print(data[i] + ",");
        }
        System.out.println(data[0] + "]");
    }
}
