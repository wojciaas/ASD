public class Main {
    public static void main(String[] args) {
        {
            Graph g = new Graph();
            Vertex I = new Vertex("I", Vertex.Color.RED);
            Vertex A = new Vertex("A", Vertex.Color.GREEN);
            Vertex B = new Vertex("B", Vertex.Color.RED);
            Vertex F = new Vertex("F", Vertex.Color.BLUE);
            Vertex G = new Vertex("G", Vertex.Color.GREEN);
            Vertex E = new Vertex("E", Vertex.Color.GREEN);
            Vertex C = new Vertex("C", Vertex.Color.RED);
            Vertex D = new Vertex("D", Vertex.Color.GREEN);
            Vertex H = new Vertex("H", Vertex.Color.BLUE);

            g.addVertex(I);
            g.addVertex(A);
            g.addVertex(B);
            g.addVertex(F);
            g.addVertex(G);
            g.addVertex(E);
            g.addVertex(C);
            g.addVertex(D);
            g.addVertex(H);

            g.addEdge(I, A);
            g.addEdge(A, B);
            g.addEdge(A, F);
            g.addEdge(F, G);
            g.addEdge(B, E);
            g.addEdge(G, E);
            g.addEdge(G, D);
            g.addEdge(E, C);
            g.addEdge(C, D);
            g.addEdge(D, H);

            GraphSearch gs = new GraphSearch();
            gs.searchColor(g, I, Vertex.Color.GREEN);

            gs.hasCycle(g);

            ImageProcessor ip = new ImageProcessor();
            int[][] image = new int[][]{
                    {1, 1, 1, 1, 1, 1, 1, 1},
                    {1, 0, 0, 1, 0, 0, 0, 1},
                    {1, 0, 0, 1, 1, 1, 0, 1},
                    {1, 1, 1, 0, 0, 1, 1, 1},
                    {1, 0, 1, 0, 0, 0, 1, 1},
                    {1, 0, 1, 1, 1, 0, 1, 1},
                    {1, 0, 1, 0, 1, 0, 1, 1},
                    {1, 1, 1, 0, 1, 1, 1, 1}
            };
            ip.floodFill(image, 4, 4, 2);

            for (int[] row : image) {
                for (int pixel : row) {
                    System.out.print(pixel + " ");
                }
                System.out.println();
            }
        }

        {
            Graph g = new Graph();
            Vertex A = new Vertex("A", Vertex.Color.RED);
            Vertex B = new Vertex("B", Vertex.Color.GREEN);
            Vertex E = new Vertex("E", Vertex.Color.RED);
            Vertex D = new Vertex("D", Vertex.Color.GREEN);
            Vertex C = new Vertex("C", Vertex.Color.BLUE);
            Vertex F = new Vertex("F", Vertex.Color.GREEN);

            g.addVertex(A);
            g.addVertex(B);
            g.addVertex(E);
            g.addVertex(D);
            g.addVertex(C);
            g.addVertex(F);

            g.addSingleEdge(A, B);
            g.addSingleEdge(A, E);
            g.addSingleEdge(B,F);
            g.addEdge(E, D);
            g.addSingleEdge(E, C);
            g.addSingleEdge(D, F);
            g.addSingleEdge(C, F);
            g.addSingleEdge(F, A);

            GraphSearch gs = new GraphSearch();
            gs.hasCycle(g);
        }

    }
}
