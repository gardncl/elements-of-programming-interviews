import java.util.HashMap;
import java.util.Map;

public class Vertex {
    public Map<Vertex, Integer> edges = new HashMap<>();
    public Character id;
    public boolean visited = false;

    public Vertex(Character id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        if (visited != vertex.visited) return false;
        if (edges != null ? !edges.equals(vertex.edges) : vertex.edges != null) return false;
        return id != null ? id.equals(vertex.id) : vertex.id == null;
    }
}