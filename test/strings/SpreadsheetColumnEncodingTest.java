package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpreadsheetColumnEncodingTest {

    private int result;
    private String code;

    @Test
    void decodeSpreadsheetColumn1() {
        result = 1;
        code = "A";

        test(result, code);
    }

    @Test
    void decodeSpreadsheetColumn2() {
        result = 4;
        code = "D";

        test(result, code);
    }

    @Test
    void decodeSpreadsheetColumn3() {
        result = 27;
        code = "AA";

        test(result, code);
    }

    @Test
    void decodeSpreadsheetColumn4() {
        result = 702;
        code = "ZZ";

        test(result, code);
    }

    private void test(int result, String code) {
        assertEquals(result, SpreadsheetColumnEncoding.decodeSpreadsheetColumn(code));
    }

}