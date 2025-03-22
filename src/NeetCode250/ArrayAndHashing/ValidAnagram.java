package NeetCode250.ArrayAndHashing;

import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram1(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0 ; i < s.length() ; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0 ; i < t.length() ; i++) {
            if(map.containsKey(t.charAt(i))) {
                int currentCount = map.getOrDefault(t.charAt(i),0);
                map.put(t.charAt(i), currentCount - 1);
            }
        }

        for(Integer val : map.values()) {
            if(val > 0) return false;
        }
        return true;

    }


    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            int count = map.getOrDefault(t.charAt(i), 0) - 1;
            if (count < 0) return false;
            map.put(t.charAt(i), count);
        }
        return true;

    }

    //Better appoach

    public boolean isAnagramBetter(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] charCount = new int[26];

        for(int i = 0 ; i < s.length() ; i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for(int cnt : charCount) {
            if(cnt != 0) return false;
        }
        return true;
    }

}
