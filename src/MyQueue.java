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
    }

    public MyQueue() {
        size = 0;
        head = tail =null;
    }

    public void add(T value) {
        Node TNode = new Node(value);

        if(size > 0) {
            tail.next = TNode;
            tail = tail.next;
        } else head = tail = TNode;
        size++;
    }
    public void remove() {
        try {
            if (size > 1) head = head.next;
                else if (size == 1) head = tail = null;
            size--;
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    public T getFirst() {
        try {
            return head.value;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

}
