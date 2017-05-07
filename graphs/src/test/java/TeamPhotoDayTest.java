import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TeamPhotoDayTest {

    private int expected;
    private List<GraphVertex> G;

    @Test
    public void findLargestNumberTeams1() throws Exception {
        expected = 0;
        GraphVertex a = new GraphVertex(5);
        GraphVertex b = new GraphVertex(5);
        GraphVertex c = new GraphVertex(5);
        a.edges.add(b);
        b.edges.add(c);

        GraphVertex d = new GraphVertex(5);
        GraphVertex e = new GraphVertex(5);
        GraphVertex f = new GraphVertex(5);
        d.edges.add(e);
        e.edges.add(f);
        G = Arrays.asList(
                a,
                d
        );

        test(expected, G);
    }

    @Test
    public void findLargestNumberTeams2() throws Exception {
        expected = 1;
        GraphVertex a = new GraphVertex(5);
        GraphVertex b = new GraphVertex(7);
        GraphVertex c = new GraphVertex(4);
        a.edges.add(b);
        b.edges.add(c);

        GraphVertex d = new GraphVertex(4);
        GraphVertex e = new GraphVertex(5);
        GraphVertex f = new GraphVertex(3);
        d.edges.add(e);
        e.edges.add(f);
        G = Arrays.asList(
                a,
                d
        );

        test(expected, G);
    }

    @Test
    public void findLargestNumberTeams3() throws Exception {
        expected = 2;
        GraphVertex a = new GraphVertex(5);
        GraphVertex b = new GraphVertex(7);
        GraphVertex c = new GraphVertex(4);
        a.edges.add(b);
        b.edges.add(c);

        GraphVertex d = new GraphVertex(4);
        GraphVertex e = new GraphVertex(5);
        GraphVertex f = new GraphVertex(3);
        d.edges.add(e);
        e.edges.add(f);

        GraphVertex g = new GraphVertex(2);
        GraphVertex h = new GraphVertex(3);
        GraphVertex i = new GraphVertex(4);
        g.edges.add(h);
        h.edges.add(i);

        G = Arrays.asList(
                a,
                d,
                g
        );

        test(expected, G);
    }

    private void test(int expected, List<GraphVertex> G) {
        assertEquals(expected, TeamPhotoDay.findLargestNumberTeams(G));
    }

}