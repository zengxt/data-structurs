package com.zxt.queue;

public class ArrayStackDemo {
    public static void main(String[] args) {
        String str = new String("255.100.50.0");
        String result = str.replaceAll("\\.", "[.]");
        System.out.println(result);


        ArrayStack stack = new ArrayStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.showStack();

        System.out.println(stack.peek());
        stack.showStack();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.showStack();

        stack.push(50);
        stack.showStack();
        System.out.println(stack.peek());
    }
}
