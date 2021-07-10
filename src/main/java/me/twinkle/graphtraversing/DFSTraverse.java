package me.twinkle.graphtraversing;

import me.twinkle.util.Graph;

public class DFSTraverse implements GraphTraverse {
    @Override
    public void traverse(Integer root) {
        Graph graph = new Graph(4);

        graph.connectNode(0, 1);
        graph.connectNode(0, 2);
        graph.connectNode(1, 2);
        graph.connectNode(2, 3);

        dfs(0, graph);
    }

    private void dfs(Integer root, Graph graph) {
        graph.getVisited()[root] = true;
        System.out.println(root);
        for (Integer next : graph.getGraph()[root]) {
            if (!graph.getVisited()[next]) {
                dfs(next, graph);
            }
        }
    }
}
