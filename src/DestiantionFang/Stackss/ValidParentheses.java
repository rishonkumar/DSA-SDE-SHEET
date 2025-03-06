package DestiantionFang.Stackss;

import java.util.Stack;

public class ValidParentheses {


    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if(ch == '(') st.push(')');
            else if(ch == '{') st.push('}');
            else if (ch == '[') st.push(']');
            //return false top of the stack doesnt match or
            //The stack.isEmpty() is crucial because it handles the scenario where you encounter a
            // closing bracket when NO opening brackets have been pushed onto the stack. eg ],]]
            else if (st.isEmpty() || st.pop() != ch) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
