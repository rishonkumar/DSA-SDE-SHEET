package Strings;

import java.util.HashMap;

public class ValidAnagram {


        public boolean isAnagram(String s, String t) {

            int n = s.length();
            int m = t.length();
            if(m != n) return false;

            HashMap<Character,Integer>map = new HashMap<>();
            for(int i = 0 ; i < n ; i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }

            for(int i = 0 ; i < n ; i++) {
                int cnt = map.getOrDefault(t.charAt(i),0) - 1;
                if(cnt < 0) return false;
                map.put(t.charAt(i),cnt);
            }

            return true;
        }
}
