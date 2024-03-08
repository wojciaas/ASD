public class Vertex {
    public enum Color {
        RED, GREEN, BLUE
    }
    private final String name;
    private Color color;

    public Vertex(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
