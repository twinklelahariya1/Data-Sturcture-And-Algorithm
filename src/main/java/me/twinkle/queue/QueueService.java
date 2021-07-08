package me.twinkle.queue;

public class QueueService {
    public static void main(String[] args) {

        new QueueService().linkedListImpl();
        new QueueService().arrayImpl();

    }

    private void linkedListImpl() {
        Queue<Integer> queue = new QueueLinkedListImpl<>();
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println(queue.size());
        queue.deQueue();
        queue.enQueue(33);
        queue.enQueue(56);
        System.out.println(queue.size());
    }

    private void arrayImpl() {
        Queue<Integer> queue = new QueueArrayImpl<>();
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println(queue.size());
        queue.deQueue();
        queue.enQueue(33);
        queue.enQueue(56);
        System.out.println(queue.size());
    }
}
