package Strings;
//https://leetcode.com/problems/string-compression-iii/
public class StringCompressionIII {

    public static String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int size = word.length();
        int i = 0;
        while (i < size) {
            int countChar = 0;
            char ch = word.charAt(i);

            while (i < size && countChar < 9 && word.charAt(i) == ch) {
                countChar++;
                i++;
            }
            ans.append(countChar).append(ch);
        }
        return ans.toString();
    }

}
