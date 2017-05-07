public class ImplementCachingDictionary {

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

    public class SafeSpellCheckService implements SpellCheckService {
        
        private static final int MAX_ENTRIES = 3;

        @Override
        public void service(ServiceRequest request, ServiceResponse response) {

        }

    }
}
