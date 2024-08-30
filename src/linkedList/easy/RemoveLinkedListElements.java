package linkedList.easy;

import linkedList.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null)
            return head;

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null)
            return head;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (curr.val == val)
                prev.next = curr.next; // if match then, don't move the prev only change pointers
            else
                prev = prev.next; // if doesn't match then move prev
            curr = curr.next; // moving the curr pointer
        }

        return head;
    }
}
