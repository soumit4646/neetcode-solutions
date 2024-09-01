package linkedList.easy;

import linkedList.ListNode;

public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        len /= 2;
        int cnt = 0;
        while (cnt < len) {
            head = head.next;
            cnt++;
        }
        return head;
    }
}
