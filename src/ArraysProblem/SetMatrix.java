package src.ArraysProblem;

//https://leetcode.com/problems/set-matrix-zeroes/description/
public class SetMatrix {


    /*
         Brute force approach
         iterate wherever you get 0 then make it as -1
         again once done iterate the complete matrix convert that into 0
         so tc - (n*m ) * (n*m) + (n*m)
      */
    /*
    Better approach instead of doing -1
    i will create one row and one columm and keep a track of that
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
