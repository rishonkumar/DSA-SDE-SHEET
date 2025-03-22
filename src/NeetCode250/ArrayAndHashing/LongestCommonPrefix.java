package NeetCode250.ArrayAndHashing;
//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;

        if(n == 1) return strs[0];

        String prefix = strs[0];

        for(int i = 1 ; i < n ; i++) {
            String current = strs[i];
            int j = 0;
            while(j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++; //find till the cnt where they both are same
            }
            prefix = prefix.substring(0,j);
            if(prefix.isEmpty()) return "";
        }
        return prefix;
    }

    //vertical approach

    public String longestCommonPrefixVertical(String[] strs) {

        //take frist string as reference
        for(int i = 0 ; i < strs[0].length() ; i++) {
            char c = strs[0].charAt(i); // get current char

            //compare with same position with other string
            for(int j = 1 ; j < strs.length ; j++) {
                //so if it doesnt matach return it iterate till it is matched
                if(i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0]; // all char matched
    }
}
