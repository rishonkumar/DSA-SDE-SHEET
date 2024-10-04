import java.util.ArrayList;
import java.util.List;

public class Arrays {

    /*
    https://leetcode.com/problems/pascals-triangle/description/
    See above number and diagonal and sum it
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans = new ArrayList<>();

        List<Integer>temp = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++) {
            List<Integer>row = new ArrayList<>(i + 1);
            for(int j = 0 ; j <= i ; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    int num = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    row.add(num);
                }
            }
            ans.add(row);
        }

        return ans;

    }

}
