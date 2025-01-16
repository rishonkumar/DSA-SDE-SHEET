package DestiantionFang.LinkedList;

public class ReOrderList {

    public void reorderList(ListNode head) {

        if(head == null) return;

        ListNode slow = head, fast = head;

        //middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse
        ListNode prev = null, curr = slow, tmp;

        while (curr != null) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        //merge
        ListNode first = head, second = prev;

        while(second.next != null) {
            ListNode temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }

    }
}
