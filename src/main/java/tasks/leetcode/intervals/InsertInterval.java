package tasks.leetcode.intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * === Добавляем, merge пока можем, добавляем оставшиеся ===
 */
public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> rsl = new ArrayList<>();

        int i = 0; // Указатель для прохода по intervals
        int start = newInterval[0];
        int end = newInterval[1];
        // Добавляем, пока не будет найдено пересечение с newInterval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            rsl.add(intervals[i]);
            i++;
        }
        // Merge интервалы, пока не ликвидируем пересечение
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        // Добавляем merge interval или просто newIntervals
        rsl.add(new int[]{start, end});
        // Добавляем оставшиеся интервалы
        while (i < intervals.length && intervals[i][0] > newInterval[0]) {
            rsl.add(intervals[i]);
            i++;
        }

        return rsl.toArray(new int[rsl.size()][]);
    }
}
