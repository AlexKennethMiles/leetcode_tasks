package tasks.leetcode.linkedlist;

/**
 * === slow-fast pointers ===
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head; // Отстающий
        ListNode fast = head.next; // Догоняющий
        while (slow != fast) {
            // Если догоняющий упёрся в конец, значит цикла нет
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next; // На один ход вперёд
            fast = fast.next.next; // На два хода вперёд
            // Так рано или поздно ни встретятся (если true)
        }
        return true;
    }
}
