import java.util.ArrayList;
import java.util.List;

public class Arrays {

    /*
    https://leetcode.com/problems/pascals-triangle/description/
    See above number and left number and sum it
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

    /*
      Brute force approach
      iterate wherever you get 0 then make it as -1
      again once done iterate the complete matrix convert that into 0
      so tc - (n*m ) * (n*m) + (n*m)


     Better approach instead of doing -1
    (i) will create one row and one column and keep a track of that
     */
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {
                    //mark ith index row and jth index col with 1
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        //now mark all (i,j) as 0
        // if row[i] or col [j] is 1

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
