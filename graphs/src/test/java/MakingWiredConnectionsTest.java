import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class MakingWiredConnectionsTest {

    private boolean isFeasable;
    private List<GraphVertex> expected;
    private List<GraphVertex> G;
    private List<GraphVertex> figureNineteenDotEight;

    @Test
    public void isAnyPlacementFeasible1() throws Exception {
        isFeasable = true;
        expected = figureNineteenDotEight;

        test(isFeasable, expected, G);
    }

    @Test
    public void isAnyPlacementFeasible2() throws Exception {
        isFeasable = true;
        expected = figureNineteenDotEight;
        G.get(3).data = 1;
        G.get(16).data = 0;

        test(isFeasable, expected, G);
    }

    @Test
    public void isAnyPlacementFeasible3() throws Exception {
        isFeasable = false;
        GraphVertex a = new GraphVertex(1);
        GraphVertex b = new GraphVertex(0);
        GraphVertex c = new GraphVertex(1);
        a.edges.addAll(Arrays.asList(b,c));
        b.edges.addAll(Arrays.asList(a,c));
        c.edges.addAll(Arrays.asList(a,b));
        GraphVertex d = new GraphVertex(1);
        GraphVertex e = new GraphVertex(0);
        GraphVertex f = new GraphVertex(1);
        d.edges.addAll(Arrays.asList(e,f));
        e.edges.addAll(Arrays.asList(d,f));
        f.edges.addAll(Arrays.asList(d,e));
        expected = Arrays.asList(a,b,c,d,e,f);
        G = Arrays.asList(a,b,c,d,e,f);

        test(isFeasable, expected, G);
    }

    private void test(boolean isFeasable, List<GraphVertex> expected, List<GraphVertex> G) {
        assertEquals(isFeasable, MakingWiredConnections.isAnyPlacementFeasible(G));
        assertEquals(expected, G);
    }

    @Before
    public void setup() {
        IntStream.range(0,2).forEach(
                x -> {
                    GraphVertex a = new GraphVertex(1);
                    GraphVertex b = new GraphVertex(0);
                    GraphVertex c = new GraphVertex(1);
                    GraphVertex d = new GraphVertex(0);
                    GraphVertex e = new GraphVertex(1);
                    GraphVertex f = new GraphVertex(1);
                    GraphVertex g = new GraphVertex(0);
                    GraphVertex h = new GraphVertex(0);
                    GraphVertex i = new GraphVertex(0);
                    GraphVertex j = new GraphVertex(1);
                    GraphVertex k = new GraphVertex(1);
                    GraphVertex l = new GraphVertex(1);
                    GraphVertex m = new GraphVertex(0);
                    GraphVertex n = new GraphVertex(0);
                    GraphVertex o = new GraphVertex(1);
                    GraphVertex p = new GraphVertex(1);
                    GraphVertex q = new GraphVertex(1);
                    GraphVertex r = new GraphVertex(0);
                    GraphVertex s = new GraphVertex(0);
                    GraphVertex t = new GraphVertex(1);
                    GraphVertex u = new GraphVertex(1);
                    GraphVertex v = new GraphVertex(0);
                    a.edges.addAll(Arrays.asList(b,d));
                    b.edges.addAll(Arrays.asList(a,c,e));
                    c.edges.addAll(Arrays.asList(b,g));
                    d.edges.addAll(Arrays.asList(a,e,f));
                    e.edges.addAll(Arrays.asList(b,d,g,i));
                    f.edges.addAll(Arrays.asList(d,h,i));
                    g.edges.addAll(Arrays.asList(e,j));
                    h.edges.addAll(Arrays.asList(f,k,l));
                    i.edges.addAll(Arrays.asList(f,j,l));
                    j.edges.addAll(Arrays.asList(g,i,m));
                    k.edges.addAll(Arrays.asList(h,n));
                    l.edges.addAll(Arrays.asList(h,i,m,n));
                    m.edges.addAll(Arrays.asList(j,l,o));
                    n.edges.addAll(Arrays.asList(k,l,p,q));
                    o.edges.addAll(Arrays.asList(m,r));
                    p.edges.addAll(Arrays.asList(n,s));
                    q.edges.addAll(Arrays.asList(n,r,s));
                    r.edges.addAll(Arrays.asList(o,t));
                    s.edges.addAll(Arrays.asList(p,q,u));
                    t.edges.addAll(Arrays.asList(r,v));
                    u.edges.addAll(Arrays.asList(s,v));
                    v.edges.addAll(Arrays.asList(t,u));


                    switch (x) {
                        case 0:
                            figureNineteenDotEight = Arrays.asList(
                                    a,b,c,d,e,f,
                                    g,h,i,j,k,l,
                                    m,n,o,p,q,r,
                                    s,t,u,v
                            );
                            break;
                        case 1:
                            G = Arrays.asList(
                                    a,b,c,d,e,f,
                                    g,h,i,j,k,l,
                                    m,n,o,p,q,r,
                                    s,t,u,v
                            );
                    }
                }
        );
    }
}