package DestiantionFang.Arrays;

import java.util.HashMap;
import java.util.Map;

public class VerfifyingAlienDic {

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap = new HashMap<Character, Integer>();

        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                //Batman,Bat case
                if (j >= words[i + 1].length()) {
                    return false;
                }
                //compare letter by letter
                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    int currentLetter = orderMap.get(words[i].charAt(j));
                    int nextLetter = orderMap.get(words[i + 1].charAt(j));
                    if (nextLetter < currentLetter) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }
        return true;
    }

}
