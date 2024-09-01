package linkedList.easy;

import linkedList.ListNode;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (curr.val == prev.val)
                prev.next = curr.next;
            else
                prev = prev.next;
            curr = curr.next;
        }

        return head;
    }
}
