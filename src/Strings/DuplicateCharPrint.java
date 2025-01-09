package StringProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharPrint {

    void printDuplicateChar(String s) {

        //sort the string
        int size = s.length();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        String sortedString = new String(ch);

        for (int i = 0; i < size; i++) {
            int cnt = 1;
            while (i < size - 1 && sortedString.charAt(i) == sortedString.charAt(i + 1)) {
                cnt++;
                i++;
            }
            if (cnt > 1) {
                System.out.println(sortedString.charAt(i) + ", count = " + cnt);
            }
        }

    }

    //using map
    static void printDubs(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> mapElement : map.entrySet()) {
            if (mapElement.getValue() > 1) {
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
            }
        }
    }
}
