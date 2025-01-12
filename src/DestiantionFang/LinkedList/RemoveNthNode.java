package DestiantionFang.LinkedList;

public class RemoveNthNode {
    /*
    Two Pointers (Front and Back):

Purpose: Two pointers are used to find the n-th node from the end in a single pass.
Front Pointer: Advances n+1 steps from the dummy node. This creates a gap of
n nodes between the front and back pointers.
Back Pointer: Starts at the dummy node and moves with the front pointer until front reaches the end.
This places back at the node before the one to be removed
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode front = dummy;
        ListNode back = dummy;

        //now move front to the nth node from the beginning
        for (int i = 0; i <= n; i++) {
            front = front.next;
        }

        //now move both front and back until front reaches the end
        while (front != null) {
            front = front.next;
            back = back.next;
        }
        back.next = back.next.next;

        return dummy.next;
    }
}
