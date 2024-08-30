package linkedList.medium;

import linkedList.ListNode;
import java.util.Stack;

public class MergeInBetweenLinkedLists {
    public ListNode removeNodes(ListNode head) { // tc - o(n) && sc - o(n)

        if (head.next == null) return head;

        Stack<Integer> s = new Stack<>();
        s.push(head.val);
        head = head.next;
        while (head != null) {
            while (!s.empty() && (s.peek() < head.val)) s.pop();
            s.push(head.val);
            head = head.next;
        }

        ListNode new_head = null;

        while (!s.empty()) {
            if (new_head == null) {
                new_head = new ListNode(s.pop());
            } else {
                ListNode temp = new ListNode(s.pop(), new_head);
                new_head = temp;
            }
        }
        return new_head;
    }
}
