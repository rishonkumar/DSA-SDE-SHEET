package Strings;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class FirstOccurence {
    public int strStr(String a, String b) {
        // If needle is empty, return 0

        if (b.isEmpty()) return 0;

        for (int i = 0; i <= a.length() - b.length(); i++) {
            if (a.substring(i, i + b.length()).equals(b)) return i;
        }
        return -1;
    }
}
