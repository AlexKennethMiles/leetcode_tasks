package tasks.leetcode.array;

public class RemoveVal {
    public static void main(String[] args) {
        int[] array = new int[]{3, 3, 3, 2};
        System.out.println(removeElement(array, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int temp;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}
