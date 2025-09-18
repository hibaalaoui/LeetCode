import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int[][] results = new int[n][2]; 
        results[0] = intervals[0];
        int prev = 0;

        for (int curr = 1; curr < n; curr++) {
            if (intervals[curr][0] <= results[prev][1]) {
                // fusion avec le dernier intervalle déjà ajouté
                results[prev][0] = Math.min(intervals[curr][0], results[prev][0]);
                results[prev][1] = Math.max(intervals[curr][1], results[prev][1]);
            } else {
                // sinon, on ajoute un nouvel intervalle
                prev++;
                results[prev] = intervals[curr];
            }
        }
        
        return Arrays.copyOfRange(results, 0, prev + 1);
    }
}
