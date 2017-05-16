import org.junit.Test;

import static org.junit.Assert.*;

public class IsLetterConstructableTest {

    boolean expected;
    String letterText;
    String magazineText;

    @Test
    public void isConstructable1() throws Exception {
        expected = true;
        letterText = "No government should control men.";
        magazineText = "If men were angels, no government would be necessary. If angels were to govern men, neither external nor internal controls on government would be necessary. In framing a government which is to be administered by men over men, the great difficulty lies in this: you must first enable the government to control the governed; and in the next place, oblige it to control itself.";

        test(expected, letterText, magazineText);
    }

    @Test
    public void isConstructable2() throws Exception {
        expected = true;
        letterText = "Politics are at last tranquil";
        magazineText = "To model our political system upon speculations of lasting tranquility, is to calculate on the weaker springs of the human character.";

        test(expected, letterText, magazineText);
    }

    @Test
    public void isConstructable3() throws Exception {
        expected = false;
        letterText = "Liberty can never be a higher ideal than justice.";
        magazineText = "Justice is the end of government. It is the end of civil society. It ever has been and ever will be pursued until it be obtained, or until liberty be lost in the pursuit.";

        test(expected, letterText, magazineText);
    }

    private void test(boolean expected, String letterText, String magazineText) {
        assertEquals(expected, IsLetterConstructable.isConstructable(letterText, magazineText));
    }

}