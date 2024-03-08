import java.util.*;

public class GraphSearch {
    public void searchColor(Graph G, Vertex s, Vertex.Color c) {
        List<Vertex> result = new ArrayList<>();
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        queue.add(s);
        visited.add(s);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            if (current.getColor().equals(c))
                result.add(current);


            for (Vertex neighbour : G.getVertices().get(current))
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
        }
        System.out.println(result);
    }

    public void hasCycle(Graph G) {
        Set<Vertex> visited = new HashSet<>();
        Set<Vertex> recStack = new HashSet<>();

        for (Vertex v : G.getVertices().keySet())
            if (hasCycleUtil(G, v, visited, recStack))
                System.out.println("Cycle detected");
    }

    private boolean hasCycleUtil(Graph G, Vertex v, Set<Vertex> visited, Set<Vertex> recStack) {
        if (recStack.contains(v))
            return true;

        if (visited.contains(v))
            return false;

        visited.add(v);
        recStack.add(v);

        for (Vertex neighbour : G.getVertices().get(v))
            if (hasCycleUtil(G, neighbour, visited, recStack))
                return true;

        recStack.remove(v);
        return false;
    }
}
