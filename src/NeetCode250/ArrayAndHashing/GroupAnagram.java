package NeetCode250.ArrayAndHashing;

import java.util.*;

public class GroupAnagram {
    /*
    Sorting approach
    Time Complexity: O(N * K * log K), where:
    N is the length of strs array
    K is the maximum length of a string in strs
    log K comes from sorting each string
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>>map = new HashMap<>();

        for(String str : strs) {
            char[] ch = str.toCharArray();
            //sort the charachter
            Arrays.sort(ch);

            //convert back to string
            String sortedString = new String(ch);

            //if sorted string is not in map, create a new list
            //if exist add to exisiting list
            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(str);
        }
        //convert map values to list
        return new ArrayList<>(map.values());
    }


    public List<List<String>> groupAnagramsHT(String[] strs) {

        Map<String,List<String>>map = new HashMap<>();

        for(String str : strs) {
            int[] count = new int[26];

            for(char c : str.toCharArray()) {
                // a become 0 b => 1
                count[c - 'a']++;
            }

            //convert count array to string to use as a hashmap key
            String key = Arrays.toString(count);

            //if key doesnt exist add in map
            map.putIfAbsent(key, new ArrayList<>());

            //get the list for this key and add the current string
            map.get(key).add(str);
        }
        //convert map values to list
        return new ArrayList<>(map.values());
    }
}
