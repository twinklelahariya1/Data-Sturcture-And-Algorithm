package me.twinkle.queue;

public class QueueService {
    public static void main(String[] args) {

        new QueueService().linkedListImpl();
        new QueueService().arrayImpl();

    }

    private void linkedListImpl() {
        Queue<Integer> queue = new QueueLinkedListImpl<>();
        queue.push(5);
        queue.push(6);
        System.out.println(queue.size());
        queue.pop();
        queue.push(33);
        queue.push(56);
        System.out.println(queue.size());
    }

    private void arrayImpl() {
        Queue<Integer> queue = new QueueArrayImpl<>();
        queue.push(5);
        queue.push(6);
        System.out.println(queue.size());
        queue.pop();
        queue.push(33);
        queue.push(56);
        System.out.println(queue.size());
    }
}
