import java.util.*;

public class Graph {
    private final Map<Vertex, List<Vertex>> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public void addVertex(Vertex name) {
        vertices.putIfAbsent(name, new ArrayList<>());
    }

    public void addEdge(Vertex src, Vertex dest) {
        vertices.get(src).add(dest);
        vertices.get(dest).add(src);
    }

    public void addSingleEdge(Vertex src, Vertex dest) {
        vertices.get(src).add(dest);
    }

    public Map<Vertex, List<Vertex>> getVertices() {
        return vertices;
    }
}
