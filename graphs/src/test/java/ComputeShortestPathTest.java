import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeShortestPathTest {

    private List<Vertex> expected;
    private int cost;
    private List<Vertex> graph;
    private Vertex s;
    private Vertex t;

    @Test
    public void compute1() throws Exception {
        cost = 1;
        expected = Arrays.asList(
                graph.get(0),
                graph.get(2),
                graph.get(4),
                graph.get(3),
                graph.get(7)
        );
        s = graph.get(0);
        t = graph.get(7);

        test(expected,cost,graph,s,t);
    }

    @Test
    public void compute2() throws Exception {
        cost = 1;
        expected = Collections.emptyList();
        s = graph.get(9);
        t = graph.get(12);

        test(expected,cost,graph,s,t);
    }

    private void test(List<Vertex> expected, int cost, List<Vertex> graph, Vertex s, Vertex t) {
        assertEquals(expected,ComputeShortestPath.compute(cost, graph, s, t));
    }

    @Before
    public void setup() {
        Vertex a = new Vertex('A');
        Vertex b = new Vertex('B');
        Vertex c = new Vertex('C');
        Vertex d = new Vertex('D');
        Vertex e = new Vertex('E');
        Vertex f = new Vertex('F');
        Vertex g = new Vertex('G');
        Vertex h = new Vertex('H');
        Vertex i = new Vertex('I');
        Vertex j = new Vertex('J');
        Vertex k = new Vertex('K');
        Vertex l = new Vertex('L');
        Vertex m = new Vertex('M');
        Vertex n = new Vertex('N');
        a.edges.put(b,3);
        a.edges.put(c,2);
        c.edges.put(e,8);
        e.edges.put(d,7);
        d.edges.put(c,5);
        d.edges.put(h,5);
        b.edges.put(a,4);
        b.edges.put(k,1);
        k.edges.put(i,1);
        i.edges.put(k,6);
        j.edges.put(l,7);
        l.edges.put(i,9);
        j.edges.put(f,1);
        f.edges.put(g,6);
        g.edges.put(f,7);
        g.edges.put(h,4);
        m.edges.put(n,5);
        n.edges.put(m,12);

        graph = Arrays.asList(
                a,b,c,d,e,
                f,g,h,i,j,
                k,l,m,n
        );
    }

}