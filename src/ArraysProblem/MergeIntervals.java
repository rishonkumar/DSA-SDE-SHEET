package ArraysProblem;

import java.util.ArrayList;
import java.util.Arrays;

/*
 1 3
 2 6
 8 10
 15 18
https://www.youtube.com/watch?v=_FkR5zMwHQ0&t=2s
 In case of intervals

    first sort based on starting point

            Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0])); => means sort on basis 0th col, increasing
            Arrays.sort(intervals, (a,b) -> Integer.compare(b[0], a[0])); => means sort on basis 0th col, decreasing

 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            // If result is empty or if current interval doesn't overlap with previous
            // Note: intervals are overlapping if the start of current interval is <= end of previous interval
            if (result.isEmpty() || interval[0] > result.get(result.size() - 1)[1]) {
                result.add(interval);
            } else {
                // Update the end time of the previous interval to include the current interval
                int[] prevInterval = result.get(result.size() - 1);
                prevInterval[1] = Math.max(prevInterval[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
