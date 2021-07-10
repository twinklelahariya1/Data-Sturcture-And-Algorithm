package me.twinkle.util;

import java.util.LinkedList;

public class Graph {
    final int size;
    final LinkedList<Integer>[] graph;
    boolean[] visited;

    public Graph(int size) {
        this.size = size;
        this.graph = new LinkedList[size];
        this.visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            graph[i] = new LinkedList<>();
        }
    }

    public boolean[] getVisited() {
        return visited;
    }

    public LinkedList<Integer>[] getGraph() {
        return graph;
    }

    public void connectNode(Integer source, Integer destination) {
        graph[source].add(destination);
    }

}
