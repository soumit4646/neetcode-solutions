package linkedList.easy;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // check for empty ll or ll with 1 element
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode currNext = curr.next; // reference of the next element
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev; // at the end prev will be pointing to the last element
    }
}
