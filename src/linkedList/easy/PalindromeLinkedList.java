package linkedList.easy;

import linkedList.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        
        if (head.next == null) return true;

        ListNode temp = head;
        int len = 0;

        while (temp != null) {
            len += 1;
            temp = temp.next;
        }

        int mid = len / 2;

        if (len % 2 == 0) {
            // even case
            temp = head;
            int cnt = 0;
            while (cnt < mid) {
                cnt++;
                temp = temp.next;
            }

            ListNode prev = null;
            while (temp != null) {
                ListNode x = temp.next;
                temp.next = prev;
                prev = temp;
                temp = x;
            }

            while (prev != null && head != null) {
                if (prev.val != head.val) return false;
                prev = prev.next;
                head = head.next;
            }

            return true;

        } else {
            // odd case
            temp = head;
            int cnt = 0;
            while (cnt < mid) {
                cnt++;
                temp = temp.next;
            }
            temp = temp.next;

            ListNode prev = null;
            while (temp != null) {
                ListNode x = temp.next;
                temp.next = prev;
                prev = temp;
                temp = x;
            }

            while (prev != null && head != null) {
                if (prev.val != head.val) return false;
                prev = prev.next;
                head = head.next;
            }
            return true;
        }
    }
}
