import java.util.*;
import java.util.stream.Collectors;

public class ImplementCachingDictionary implements SpellCheckService {

    /*
    20.1

    The program below is part of an online spell correction service.
    Clients send as input a string, and the service returns an array
    of strings in its dictionary that are closest to the input string
    (this array could be computed, for example, using solution 17.2
    on Page 313). The service caches results to improver performance.
    Critique the implementation and provide a solution that overcomes
    its limitations.
     */


    private Spell dictionary = new Spell();
    private static final int MAX_ENTRIES = 3;

    @Override
    public void service(ServiceRequest request, ServiceResponse response) {
        LinkedHashMap<String, List<String>> closest = new LinkedHashMap<>();
        closest.put(request.extractWordToCheckFromRequest(), dictionary.closest(request.extractWordToCheckFromRequest()));
        response.encodeIntoResponse(closest);
    }

    public class Spell {
        public List<String> closest(String word) {
            int kthClosest = 0;
            int entries = 0;
            Map<Integer, String> closest = new HashMap<>();
            for (String entry: dictionary) {
                Integer tmp = ComputeLevenshtein.levenschteinDistance(word, entry);
                if (entries < k) {
                    ++entries;
                    closest.put(tmp, entry);
                    if (tmp > kthClosest)
                        kthClosest = tmp;
                } else if (tmp < kthClosest) {
                    closest.remove(Collections.max(closest.keySet()));
                    closest.put(tmp, entry);
                }
            }
            return closest.entrySet()
                    .stream()
                    .map(Map.Entry::getValue)
                    .collect(Collectors.toList());
        }

        private final int k = 3;
        private final List<String> dictionary = Arrays.asList(
                "bat", "cat", "mat", "dog", "mop",
                "top", "bop", "nob", "mob", "bob"
        );

    }
}
