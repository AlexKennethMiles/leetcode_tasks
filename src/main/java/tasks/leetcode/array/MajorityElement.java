package tasks.leetcode.array;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int el = 0;
        int cnt = 0;
        // Находим мажоритарный элемент  (в условии он точно должен быть)
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        // Проверяем, что найденный элемент мажоритарный (если его не было изначально)
        // Для LeetCode задачи №169 код ниже избыточен — можно сразу возвращать el
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }
        if (cnt1 > (n / 2)) {
            return el;
        }
        return -1;
    }
}
