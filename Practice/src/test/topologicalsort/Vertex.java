package test.topologicalsort;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String data;
    private List<Vertex> neighbourList;
    private boolean visited;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex(String data) {
        this.data = data;
        neighbourList = new ArrayList<>();
    }

    public void addNeighbourList(Vertex vertex) {
        neighbourList.add(vertex);
    }

    @Override
    public String toString() {
        return data;
    }
}