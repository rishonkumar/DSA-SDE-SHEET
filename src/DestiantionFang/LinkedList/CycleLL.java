package DestiantionFang.LinkedList;

public class CycleLL {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null ) {
            if(fast.next == null) return false;

            if(fast == slow) return true;

            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
