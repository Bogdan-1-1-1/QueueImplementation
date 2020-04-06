public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<Integer>();

        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(q.getFirst());
            q.remove();
        }
    }
}
