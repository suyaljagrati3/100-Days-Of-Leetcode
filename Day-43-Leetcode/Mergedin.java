
class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) { //basecase
            return intervals;
        }

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Take the first interval as the current interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 3: Traverse the remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // Step 4: Check if the intervals overlap
            if (nextStart <= end) {

                // Merge by extending the end
                end = Math.max(end, nextEnd);

            } else {

                // Step 5: No overlap → save the current interval
                merged.add(new int[]{start, end});

                // Start a new interval
                start = nextStart;
                end = nextEnd;
            }
        }

        // Step 6: Add the last interval
        merged.add(new int[]{start, end});

        // Step 7: Convert List<int[]> to int[][]
        return merged.toArray(new int[merged.size()][]);
    }
}