package strings;

public class InteconvertStringAndInteger {

    public static Integer stringToInt(String number) {
        boolean neg = false;
        int returnValue = 0;
        if ((int)number.charAt(0) == 45) {
            number = number.substring(1);
            neg = true;
        }
        for (int i = 0; i < number.length(); i++) {
            returnValue = (returnValue * 10) + Character.getNumericValue(number.charAt(i));
        }

        if (neg)
            returnValue *= -1;
        return returnValue;
    }

    public static String intToString(Integer number) {
        if (number == 0)
            return "0";
        boolean neg = false;
        if (number < 0) {
            neg = true;
            number *= -1;
        }

        StringBuilder string = new StringBuilder();
        while (number!=0) {
            string.append(number % 10);
            number /= 10;
        }
        if (neg)
            string.append("-");
        return string.reverse().toString();
    }

}
