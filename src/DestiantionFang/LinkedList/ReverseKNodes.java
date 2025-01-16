package DestiantionFang.LinkedList;

public class ReverseKNodes {

    // This method reverses nodes in k-group and returns the new head of the list
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr = head; // Pointer to traverse the list
        ListNode ktail = null; // Tail of the last reversed k-group
        ListNode newHead = null; // New head of the reversed list

        // Continue until there are no more nodes left to process
        while(ptr != null) {
            int cnt = 0;
            ptr = head;

            // Check if there are at least k nodes left to reverse
            while(cnt < k && ptr != null) {
                ptr = ptr.next;
                cnt++;
            }

            // If we have k nodes, reverse them
            if(cnt == k) {
                ListNode revHead = reverseList(head, k); // Reverse k nodes and get the new head of this segment

                if(newHead == null) {
                    newHead = revHead; // Set the new head if it's the first reversed segment
                }

                if(ktail != null) {
                    ktail.next = revHead; // Connect the last segment's tail to the current reversed head
                }

                ktail = head; // Update ktail to the current segment's original head (now the tail after reversal)
                head = ptr; // Move head to the next segment to be processed
            }
        }
        // Connect the remaining nodes to the last processed segment
        if (ktail != null) {
            ktail.next = head;
        }

        // Return the new head of the reversed list
        return newHead == null ? head : newHead;
    }

    public ListNode reverseList(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;

        while (k > 0) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            k--;
        }
        return prev;
    }
}
