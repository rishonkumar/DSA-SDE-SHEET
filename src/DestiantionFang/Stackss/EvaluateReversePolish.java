package DestiantionFang.Stackss;

import java.util.Stack;

public class EvaluateReversePolish {

//https://leetcode.com/problems/evaluate-reverse-polish-notation/
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if(isOperator(token)) {
                int a = stack.pop(); //first operand
                int b = stack.pop(); //second operand

                int res = applyOperand(token, b, a);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") ||
                str.equals("*") || str.equals("/");
    }

    private int applyOperand(String operator, int a, int b) {
        switch (operator) {
            case "+" : return a + b;
            case "-" : return a - b;
            case "*" : return a * b;
            case "/" : return a / b;
            default: throw  new IllegalArgumentException("Invalid operator");
        }
    }
}
