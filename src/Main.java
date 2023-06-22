import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getFirstNonRepeatedChar("a green apple"));
    }

    public static char getFirstNonRepeatedChar(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return Character.MIN_VALUE;
    }
}