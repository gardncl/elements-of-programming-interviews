import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphVertex {
    public int label;
    public List<GraphVertex> edges;
    public boolean visited;

    public GraphVertex(int label) {
        this.label = label;
        this.edges = new ArrayList<>();
        this.visited = false;
    }

    public GraphVertex(int label, GraphVertex... graphVertices) {
        this.label = label;
        this.edges = Arrays.asList(graphVertices);
        this.visited = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GraphVertex that = (GraphVertex) o;

        if (label != that.label) return false;
        return edges != null ? edges.equals(that.edges) : that.edges == null;
    }
}
