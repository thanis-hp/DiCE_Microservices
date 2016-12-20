package my.com.tm.dice.ipay.microservices.util;

public class StandardValueComparisonUtil {

    public static final String Y = "Y";
    public static final String YES = "YES";
    public static final String N = "N";
    public static final String NO = "NO";

    public static boolean isFlagY(String flagValue) {
        return Y.equalsIgnoreCase(flagValue) || YES.equalsIgnoreCase(flagValue);
    }

    public static boolean isFlagN(String flagValue) {
        return N.equalsIgnoreCase(flagValue) || NO.equalsIgnoreCase(flagValue);
    }
}
