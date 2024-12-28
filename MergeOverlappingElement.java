import java.util.Arrays;

public class MergeOverlappingElement {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        // Sort intervals
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //merge sort array
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=0; i<intervals.length; i++) {
            if(intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
            }
            else {
                System.out.print("[ " + start + " " +  end + " ]");
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        //print last interval
        System.out.println("[" +start + " " + end + "]");
}
}

