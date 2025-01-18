package DestiantionFang.Stackss;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinRemoveMakeValidParentheses {

    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        Set<Integer> removeIndices = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                //invaid case so push the index to removeIndices
                if (stack.isEmpty()) {
                    removeIndices.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        //now need to take care of opening paratheses which are not closed
        while(!stack.isEmpty()) {
            removeIndices.add(stack.pop());
        }

        //build the result string now
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++) {
            //basically remove all tge particular index from the string and push the rest to the result
            if(!removeIndices.contains(i)) {
                res.append(s.charAt(i));
            }
        }
        return res.toString();

    }
}
