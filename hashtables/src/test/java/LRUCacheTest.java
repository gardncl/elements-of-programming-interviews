import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class LRUCacheTest {

    @Test
    public void lruCache() {
        final int capacity = 8;
        final Map<Integer, Integer> map = new HashMap<>();
        final List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        final LRUCache cache = new LRUCache(capacity);
        list.forEach(i -> {
            cache.insert(i, i);
        });

        //FIRST TWO HAVE BEEN REPLACED
        assertNull(cache.lookup(1));
        assertNull(cache.lookup(2));

        //LRU IS NOW MOST RECENTLY ACCESSED
        assertEquals(list.get(3), cache.lookup(3));

        //INSERT ONE AND BUMP OFF LAST ENTRY
        cache.insert(1, 1);

        //ASSERT PREVIOUSLY LRU IS GONE
        assertNull(cache.lookup(4));

        //ASSERT THAT REMOVING AN ELEMENT WORKS
        cache.remove(1);
        assertNull(cache.lookup(1));
    }

}