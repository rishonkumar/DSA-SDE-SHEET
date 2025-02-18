package Strings;

import java.util.Stack;
//https://leetcode.com/problems/construct-smallest-number-from-di-string/?envType=daily-question&envId=2025-02-18
public class ConstructSmallestNumberDI {

    /*
    Whenever i see I or index out of bond then i will pop from eemnt and push it
     */

    public String smallestNumber(String pattern) {
        Stack<Character>stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        int n = pattern.length();
        int counter = 1;

        for(int i = 0 ; i <=n ; i++) {
            stack.push((char) ('0' + counter++)); // push the next number

            if(i == n || pattern.charAt(i) == 'I') {
                while(!stack.isEmpty()) {
                    res.append(stack.pop());
                }
            }
        }
        return res.toString();
    }

    private boolean matchesPattern(String num,String pattern) {
        for(int i = 0 ; i < pattern.length() ; i++) {
            if((pattern.charAt(i) == 'D' && num.charAt(i) < num.charAt(i + 1)) ||
                    (pattern.charAt(i) == 'I' && num.charAt(i) > num.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public String smallestNumberBF(String pattern) {
        int n = pattern.length();
        char[] num = new char[n + 1];

        for(int i = 0; i <= n; i++) {
            num[i] = (char) ('1' + i);
        }

        //generate permutation unitl we find one that matches the pattern
        while(!matchesPattern(new String(num), pattern)) {
            nextPermutation(num);
        }
        return new String(num);
    }

    private void nextPermutation(char[] num) {
        int i = num.length - 2;
        while (i >= 0 && num[i] >= num[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = num.length - 1;
            while (num[j] <= num[i]) {
                j--;
            }
            swap(num, i, j);
        }
        reverse(num, i + 1);
    }

    private void swap(char[] num, int i, int j) {
        char temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    private void reverse(char[] num, int start) {
        int end = num.length - 1;
        while (start < end) {
            swap(num, start++, end--);
        }
    }

}
