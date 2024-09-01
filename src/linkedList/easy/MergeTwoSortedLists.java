package linkedList.easy;

import linkedList.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode head;

        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        ListNode temp = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode x = list1;
                list1 = list1.next;
                temp.next = x;
                temp = temp.next;
            } else {
                ListNode x = list2;
                list2 = list2.next;
                temp.next = x;
                temp = temp.next;
            }
        }

        while (list1 != null) {
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }

        return head;
    }
}
