package Xlri8.HashMapProblems;

import java.util.HashMap;
import java.util.Map;

public class Learning {

    static void main() {
        Map<String,Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 82);
        scores.put("Carol", 78);

        System.out.println(scores.get("Alice"));

        System.out.println(scores.containsKey("Bob"));

        for(Map.Entry<String,Integer>pair : scores.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

    }



}
