package DestiantionFang.BackTracking;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/description/?envType=daily-question&envId=2025-02-19
public class HappyString {
    /*
    [a,b,c]
    n = 3 k = 9
    [a b a] [a b c] [a c a] [a c b] [b a b] [b a c] [b c a] [b c b] [c a b] [c a c] [c b a] [c b c]

     Length should be n and generate all possible sequences f length n

     All possible sequences of length n means BACKTTACKING

     BF
        First create all happy string then sort (lexographically) and return kth string

        Instead of sorting later try to geenrate directly in lexographical order

        for each index i we have 3 choices a,b,c

        DO EXPLORE UNDO

     */
    // Approach-1 (Khandani Backtracking Template - storing all possible strings)
    // T.C : O(n * 3 * 2^(n-1)) ~= O(n*2^n)
    // S.C : O(n * 2^n), total 2^n strings each having length n

    public void solve(int n, StringBuilder curr, List<String> res) {

        if(curr.length() == n) {
            res.add(curr.toString());
            return;
        }

        for(char ch = 'a' ; ch <= 'c' ; ch++) {
            if(curr.length() > 0 && curr.charAt(curr.length() - 1) == ch) {
                continue;
            }
            curr.append(ch); // do
            solve(n, curr, res); // explore
            curr.deleteCharAt(curr.length() - 1); // undo
        }
    }


    public String getHappyString(int n, int k) {
        StringBuilder curr = new StringBuilder();
        List<String> result = new ArrayList<>();
        solve(n, curr, result);

        if (result.size() < k)
            return "";

        return result.get(k - 1);
    }





}
