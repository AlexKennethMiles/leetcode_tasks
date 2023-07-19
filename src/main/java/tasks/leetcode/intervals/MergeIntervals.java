package tasks.leetcode.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        List<int[]> rsl = new ArrayList<>();
        // Сортируем интервалы
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        // Берём первую пару
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            // Если левый край пары меньше, чем правый сохранённой пары
            if (intervals[i][0] <= end) {
                // то интервалы пересекаются и правым краем становится больший из двух правых
                end = Math.max(end, intervals[i][1]);
            } else {
                // Иначе интервалы не пересекаются и можно заносить сохранённую пару в результат
                rsl.add(new int[]{start, end});
                // И обновить сохранённую пару, сделав равной текущей по итерации
                // (потому что в таком случае, она - база для след. интервала)
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // Досылаем последнюю пару (она всегда остаётся)
        rsl.add(new int[]{start, end});
        return rsl.toArray(new int[rsl.size()][]);
    }
}
