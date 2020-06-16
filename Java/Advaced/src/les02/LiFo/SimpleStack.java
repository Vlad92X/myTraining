package les02.LiFo;

import java.util.EmptyStackException;

public class SimpleStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }


    public void push(long element) {
        stackArray[++top] = element;

    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

}

class StackMain {
    public static void main(String[] args) {
     /*   SimpleStack simpleStack = new SimpleStack(10);
        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);
        System.out.println(simpleStack.pop());

        System.out.println(simpleStack.peek());
        System.out.println(simpleStack.isEmpty());

        isEmpty(simpleStack);*/


        MyStack<Integer> a=new MyStack<>(12);
        a.push(13);
        System.out.println(a.peek());
        System.out.println(a.peek());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.empty());
//        System.out.println(a.peek());



    }

    private static void isEmpty(SimpleStack simpleStack) {
        while (!simpleStack.isEmpty()) {
            long popElement = simpleStack.pop();
            System.out.println(popElement + " ");
        }
    }
}


//my test class Stack
class MyStack<T> {

    private class Node {

        private T data;
        private Node next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }
    }

    private Node top;

    public MyStack() {
        top = null;
    }
    public MyStack(T data) {
        Node temp = new Node(data);
        top = temp;
    }

    public boolean empty() {
        return top == null;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T value = top.data;
        top = top.next;
        return value;
    }

    public T push(T data) {
        Node temp = new Node(data);
        if (top == null) {
            top = temp;
        } else {
            top.next = temp;
            temp.next = top;
            top = temp;
        }
        return temp.data;
    }
}