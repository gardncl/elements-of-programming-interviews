import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ClientCreditsInfoTest {

    private final Map<String, Integer> clients = new HashMap<>();

    @Test
    public void test() {
        final String paul = "Paul"
                , george = "George"
                , ringo = "Ringo"
                , john = "John";

        ClientCreditsInfo info = new ClientCreditsInfo();

        //GEORGE IS MAX
        info.insert(george, 32);
        assertEquals(32, info.lookup(george));
        assertEquals(george, info.max());

        info.insert(paul, 19);
        info.insert(ringo, 42);
        info.insert(john, 11);

        //RINGO IS NEW MAX AND STAYS AT MAX
        assertEquals(ringo, info.max());
        info.addAll(10);
        assertEquals(ringo, info.max());

        //ALL ELEMENTS INCREASED BY C
        assertEquals(42, info.lookup(george));
        assertEquals(29, info.lookup(paul));
        assertEquals(52, info.lookup(ringo));
        assertEquals(21, info.lookup(john));

        //GEORGE HAS NO CREDITS
        assertTrue(info.remove(george));
        assertEquals(-1, info.lookup(george));
        assertFalse(info.remove(george));

        //PAUL IS NEW MAX
        assertTrue(info.remove(ringo));
        assertEquals(paul, info.max());
        assertFalse(info.remove(ringo));
    }
}