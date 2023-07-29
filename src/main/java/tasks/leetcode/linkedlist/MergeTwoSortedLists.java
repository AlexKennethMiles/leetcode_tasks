package tasks.leetcode.linkedlist;

/**
 * === Сохраняем голову нового связного списка head, и далее добавляем, пока один из них не закончится ===
 * Если остался один из двух, просто переводим currNode.next на него и всё (остальные и так в прав. послед.)
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currNode = new ListNode();
        ListNode head = currNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currNode.next = list1;
                list1 = list1.next;
            } else {
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode = currNode.next;
        }
        if (list1 != null) {
            currNode.next = list1;
        } else {
            currNode.next = list2;
        }
        return head.next;
    }
}
