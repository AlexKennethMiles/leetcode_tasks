package tasks.leetcode.array;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) { // Если массив из 1 элемента
            return true; // то начало == конец
        }
        int stepsLeft = nums[0]; // Отталкиваемся от первого элемента
        int index = 0; // Указатель, как в fori
        while (stepsLeft > 0) { // Пока есть остались шаги
            if (index == nums.length - 1) { // Если индекс == последнему индексу
                return true; // то мы в конце массива
            }
            stepsLeft = Math.max(stepsLeft - 1, nums[index]); // Если элемент массива даёт больше шагов, то обновляем
            index++; // "Делаем шаг в на 1 вперёд"
        }
        return false; // Если не достигли конца к этому моменту, то такой возможности уже точно нет
    }
}
