import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SafeSpellCheckServiceTest {

    private Random r = new Random();
    private ImplementCachingDictionary service = new ImplementCachingDictionary();

    @Test
    public void service() throws Exception {
        Map<String, List<String>> map = new HashMap<>();
        map.put("bat", Arrays.asList("bat", "cat", "mat"));
        map.put("cat", Arrays.asList("bat", "cat", "mat"));
        map.put("mat", Arrays.asList("bat", "cat", "mat"));
        map.put("dog", Arrays.asList("dog", "mop", "top"));
        map.put("mop", Arrays.asList("mop", "top", "bop"));
        map.put("top", Arrays.asList("top", "mop", "bop"));
        map.put("bop", Arrays.asList("bop", "top", "mop"));
        map.put("nob", Arrays.asList("nob", "mob", "bob"));
        map.put("mob", Arrays.asList("mob", "nob", "bob"));
        map.put("bob", Arrays.asList("bob", "bop", "nob"));
        String[] entries = Arrays.copyOf(map.keySet().toArray(), map.size(), String[].class);

        int size = entries.length;

        for (int i = 0; i < 10000; i++) {
            String temp = entries[r.nextInt(size)];
            ServiceResponse response = new ServiceResponse();
            service.service(new ServiceRequest(temp),response);
            LinkedHashMap<String, List<String>> returned = response.getClosest();
            assertNotNull(returned.get(temp));
            AssertUtils.assertSameContentsString(map.get(temp), returned.get(temp));
        }
    }


}