package test.dfs;

import java.util.List;
import java.util.Stack;

public class DFS {
    Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> list) {

        for (Vertex vertex : list) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                //       dfsWithStack(vertex);
                dfsWithRecursion(vertex);
            }
        }
    }

    // DFS with recursion let OS utilize stack memory , more effective way to use
    private void dfsWithRecursion(Vertex vertex) {
        System.out.println(vertex + " ");
        if (!vertex.isVisited()) {
            vertex.setVisited(true);
            dfsWithRecursion(vertex);
        }
    }

    //With this method we create a stack and build our logic based on that.
    private void dfsWithStack(Vertex rootVertex) {
        this.stack.push(rootVertex);
        rootVertex.setVisited(true);
        while (!stack.empty()) {
            Vertex vertex = stack.pop();
            System.out.print(vertex + ", ");
            for (Vertex v : vertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }
}
