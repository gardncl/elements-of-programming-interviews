package strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static strings.ComputeValidIPAddresses.computeValidIPAddresses;

class ComputeValidIPAddressesTest {

    private List<String> expectedToContain;
    private String s;

    @Test
    void computeValidIPAddresses1() {
        expectedToContain = new ArrayList<>();
        expectedToContain.add("192.168.1.1");
        expectedToContain.add("19.216.81.1");
        s = "19216811";

        test(expectedToContain, s);
    }

    @Test
    void computeValidIPAddresses2() {
        expectedToContain = new ArrayList<>();
        expectedToContain.add("255.255.11.135");
        expectedToContain.add("255.255.111.35");
        s = "25525511135";

        test(expectedToContain, s);
    }

    private void test(List<String> expectedToContain, String s) {
        List<String> result = computeValidIPAddresses(s);
        for (String expected : expectedToContain)
            assertTrue(result.contains(expected));
    }


}