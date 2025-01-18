package DestiantionFang.Stackss;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    public List<String>generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backTrack(List<String>ans, StringBuilder curr, int open, int close, int max) {

        if(curr.length() == max*2) {
            ans.add(curr.toString());
            return;
        }

        if(open < max) {
            curr.append("(");
            backTrack(ans, curr, open + 1, close, max);
            curr.deleteCharAt(curr.length() - 1);
        }
        if(close < max) {
            curr.append(")");
            backTrack(ans, curr, open, close + 1, max);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
