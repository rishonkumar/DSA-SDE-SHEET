package ArraysProblem;

import java.util.Arrays;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {


        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[][] res = new int[intervals.length][intervals.length];

        for(int i = 0; i < intervals.length; i++){
            
        }
    }
}
