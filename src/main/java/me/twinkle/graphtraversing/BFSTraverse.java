package me.twinkle.graphtraversing;

import me.twinkle.queue.Queue;
import me.twinkle.queue.QueueLinkedListImpl;
import me.twinkle.util.Graph;

import java.util.ListIterator;

public class BFSTraverse implements GraphTraverse {
    @Override
    public void traverse(Integer root) {
        Graph graph = new Graph(4);

        graph.connectNode(0, 1);
        graph.connectNode(0, 2);
        graph.connectNode(1, 2);
        graph.connectNode(2, 3);

        bfs(root, graph);
    }

    private void bfs(Integer root, Graph graph) {
        Queue<Integer> queue = new QueueLinkedListImpl<>();
        queue.enQueue(root);
        while (queue.size() != 0) {
            Integer value = queue.deQueue();
            System.out.println(value);
            ListIterator<Integer> integerListIterator = graph.getGraph()[value].listIterator();
            while (integerListIterator.hasNext()) {
                if (!graph.getVisited()[integerListIterator.next()])
                    queue.enQueue(integerListIterator.next());
            }
        }
    }
}
