package DestiantionFang.LinkedList;

public class DeleteNode {
//    https://leetcode.com/problems/delete-node-in-a-linked-list/description/
    public void deleteNode(ListNode node) {

        ListNode prev = null;

        while (node != null && node.next != null) {
            node.val = node.next.val;

            prev = node; // assign to previous
            node = node.next;
        }
        prev.next = null;
    }
}

