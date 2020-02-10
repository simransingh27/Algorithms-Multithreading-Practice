package test.graphtraversal.bfs;

public class App {
    public static void main(String[] args) {
        BFS bfs = new BFS();
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(5);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(3);
        Vertex vertex6 = new Vertex(6);
        Vertex vertex7 = new Vertex(7);


        vertex1.addNeighbourVertex(vertex2);
        vertex1.addNeighbourVertex(vertex3);
        vertex1.addNeighbourVertex(vertex5);

        vertex2.addNeighbourVertex(vertex7);
        vertex2.addNeighbourVertex(vertex6);

        vertex3.addNeighbourVertex(vertex4);


        vertex4.addNeighbourVertex(vertex3);
        vertex4.addNeighbourVertex(vertex2);
        vertex4.addNeighbourVertex(vertex1);
        bfs.bfs(vertex1);


    }
}
