package Strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Initialize the prefix with the first string
        String prefix = strs[0];

        // Iterate through the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each string
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length by one each time
                prefix = prefix.substring(0, prefix.length() - 1);
                // If prefix becomes empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};

        System.out.println("Longest Common Prefix (Test Case 1): " + longestCommonPrefix(strs1)); // Output: "fl"
    }

}
