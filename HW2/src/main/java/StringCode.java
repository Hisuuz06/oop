import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     *
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        int max = 0;
        int temp = 1;
        for (int i = 1; i < str.length(); i++) {
            char a = str.charAt(i);
            char b = str.charAt(i - 1);
            if (a == b) {
                temp++;
            } else {
                temp = 1;
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max; // YOUR CODE HERE
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     *
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char x = str.charAt(i);
            if (x >= '0' && x <= '9') {
                if (i + 1 < n) {
                    int a = Character.getNumericValue(x);
                    char x1 = str.charAt(i + 1);
                    for (int j = 1; j <= a; j++) {
                        result.append(x1);
                    }
                }
            } else {
                result.append(x);
            }
        }
        return result.toString(); // YOUR CODE HERE
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> hs = new HashSet<String>();
        for (int i = 0; i + len < a.length(); i++) {
            hs.add(a.substring(i, i + len));
        }
        if (hs.isEmpty()) {
            return false;
        }
        for (int i = 0; i + len < b.length(); i++) {
            if (hs.contains(b.substring(i, i + len))) {
                return true;
            }
        }

        return false; // YOUR CODE HERE
    }
}
