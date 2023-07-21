package tasks.leetcode.intervals;

import java.util.Arrays;

public class BurstBalloons {
    public static int findMinArrowShots(int[][] points) {
        // Сортируем сегменты по правому краю
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1[1], p2[1]));
        int ans = 0;
        int arrow = 0;
        for (int i = 0; i < points.length; i++) {
            // Если правый край сегмента не пробивается текущей стрелой
            if (ans == 0 || points[i][0] > arrow) {
                ans++; // Прибавляем стрелу
                arrow = points[i][1]; // Сдвигаем её на правый край текущего сегмента
            }
        }
        return ans;
    }
}
