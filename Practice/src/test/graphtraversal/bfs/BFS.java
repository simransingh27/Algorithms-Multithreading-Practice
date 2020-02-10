package test.graphtraversal.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void bfs(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);
        root.setVisited(true);

        while (!queue.isEmpty()) {

            Vertex actualNode = queue.remove();
            System.out.println("Actual Node : "+actualNode);

            for (Vertex temp : actualNode.getNeighbourList()) {

                if (!temp.isVisited()) {
                    temp.setVisited(true);
                    queue.add(temp);
                }

            }


        }

    }
}
