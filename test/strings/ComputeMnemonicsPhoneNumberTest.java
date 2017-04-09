package strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComputeMnemonicsPhoneNumberTest {

    private List<String> expectedResults;
    private String phoneNumber;

    @Test
    void computeMnemonics1() {
        phoneNumber = "2276696";
        expectedResults = Arrays.asList("ACRONYM", "ABPOMZN");

        test(expectedResults, phoneNumber);
    }

    @Test
    void computeMnemonics2() {
        phoneNumber = "5387739";
        expectedResults = Arrays.asList("JETPREY", "LETSSEX", "JETSPEW");

        test(expectedResults, phoneNumber);
    }

    private void test(List<String> expectedResults, String phoneNumber) {
        List<String> actualResults = ComputeMnemonicsPhoneNumber.computeMnemonics(phoneNumber);
        for (String mnemonic : expectedResults) {
            assertTrue(actualResults.contains(mnemonic));
        }
    }

}