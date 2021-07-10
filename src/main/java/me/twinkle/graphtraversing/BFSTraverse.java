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
        graph.getVisited()[root] = true;
        while (queue.size() != 0) {
            root = queue.deQueue();
            System.out.println(root);
            ListIterator<Integer> integerListIterator = graph.getGraph()[root].listIterator();
            while (integerListIterator.hasNext()) {
                Integer value = integerListIterator.next();
                if (!graph.getVisited()[value]) {
                    graph.getVisited()[value] = true;
                    queue.enQueue(value);
                }
            }
        }
    }
}
