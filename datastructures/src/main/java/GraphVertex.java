import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphVertex {
    public int data;
    public List<GraphVertex> edges;
    public boolean visited;

    public GraphVertex(int data) {
        this.data = data;
        this.edges = new ArrayList<>();
        this.visited = false;
    }

    public GraphVertex(int data, GraphVertex... graphVertices) {
        this.data = data;
        this.edges = Arrays.asList(graphVertices);
        this.visited = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GraphVertex that = (GraphVertex) o;

        if (data != that.data) return false;
        return edges != null ? edges.equals(that.edges) : that.edges == null;
    }
}
