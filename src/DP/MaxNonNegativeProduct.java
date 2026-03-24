package DP;

import java.util.AbstractMap;

//https://leetcode.com/problems/maximum-non-negative-product-in-a-matrix/description/?envType=daily-question&envId=2026-03-23

public class MaxNonNegativeProduct {

    int n, m;
    final int MOD = 1000000007;

    Pair<Long,Long>[][] t; // memoization table for storing max min pair

    private Pair<Long,Long> solve(int i, int j, int[][] grid) {

        //base case if we are at bottm right corner return the value
        if(i == m - 1 && j == n-1) {
            return new Pair<>((long)grid[i][j], (long)grid[i][j]);
        }

        long maxValue = Long.MIN_VALUE;
        long minValue = Long.MAX_VALUE;

        //if already computer return the memoized result
        if(t[i][j] != null) {
            return t[i][j];
        }

        //move down
        if(i + 1 < m) {
            Pair<Long,Long> down = solve(i+1, j, grid);

            long downMax = down.getKey();
            long downMin = down.getValue();

            maxValue = Math.max(maxValue, Math.max(grid[i][j] * downMax, grid[i][j] * downMin));
            minValue = Math.min(minValue, Math.min(grid[i][j] * downMax, grid[i][j] * downMin));

        }

        // Move right
        if (j + 1 < n) {
            Pair<Long, Long> right = solve(i, j + 1, grid);

            long rightMax = right.getKey();
            long rightMin = right.getValue();

            maxValue = Math.max(maxValue,
                    Math.max(grid[i][j] * rightMax, grid[i][j] * rightMin));

            minValue = Math.min(minValue,
                    Math.min(grid[i][j] * rightMax, grid[i][j] * rightMin));
        }

        t[i][j] = new Pair<>(maxValue,minValue);
        return  t[i][j];
    }

    public int maxProductPath(int[][] grid) {

        m = grid.length;
        n = grid[0].length;

        t = new Pair[m][n];
        Pair<Long, Long> res= solve(0,0,grid);

        return res.getKey() < 0 ? -1 : (int) (res.getKey() % MOD);
    }


}
