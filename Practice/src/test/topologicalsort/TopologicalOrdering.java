package test.topologicalsort;

import java.util.Stack;

// Algorithm utilized to build project management for example Maven, gradle, etc.
public class TopologicalOrdering {
    private Stack<Vertex> stack;

    public TopologicalOrdering() {
        this.stack = new Stack<>();
    }

    public void dfs(Vertex vertex) {
        vertex.setVisited(true);
        for (Vertex v : vertex.getNeighbourList()) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
        stack.push(vertex);
    }

    public Stack<Vertex> getStack() {
        return stack;
    }
}

