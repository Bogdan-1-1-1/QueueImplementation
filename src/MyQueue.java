public class MyQueue<T> {
    private Node head, tail;
    private int size;

    private class Node {
        Node prev, next;
        T value;

        Node() {
            value = null;
            prev = next = null;
        }
        Node(T value) {
            this.value = value;
            prev = next = null;
        }
    }  //node class, that provides the Queue

    public MyQueue() {
        size = 0;
        head = tail = null;
    }  //constructor (as I know, there is no need to create destructor in java)

    public void push(T value) {
        Node TNode = new Node(value);

        if(size > 0) {
            tail.next = TNode;
            tail = tail.next;
        } else head = tail = TNode;
        size++;
    }
    public void pop() {
        if (size > 1) head = head.next;
            else if (size == 1) head = tail = null;
        size--;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return (size <= 0);
    }
    public T front() {
        try {
            return head.value;
        } catch (NullPointerException e) {
            // e.printStackTrace();
            return null;
        }
    }
    public T back() {
        try {
            return tail.value;
        } catch (NullPointerException e) {
            // e.printStackTrace();
            return null;
        }
    }  //in fact, only Dequeue implements such method. However, "node"-like construction allows coding methods like this

}
