package linkedList.easy;

import java.util.HashSet;

import linkedList.ListNode;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> s = new HashSet<>();

        while (headB != null) {
            s.add(headB);
            headB = headB.next;
        }

        while (headA != null) {
            if (s.contains(headA)) {
                return headA;
            }
            headA = headA.next;
        }

        return null;
    }
}
