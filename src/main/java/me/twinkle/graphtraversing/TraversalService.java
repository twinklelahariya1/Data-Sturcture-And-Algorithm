package me.twinkle.graphtraversing;

public class TraversalService {

    public static void main(String[] args) {
        GraphTraverse bfsGraphTraverse = new BFSTraverse();
        GraphTraverse dfsGraphTraverse = new DFSTraverse();

        dfsGraphTraverse.traverse(0);

        System.out.println("BREAKING BETWEEN BFS AND DFS");

        bfsGraphTraverse.traverse(0);
    }
}
