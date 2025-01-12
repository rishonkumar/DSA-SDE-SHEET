package DestiantionFang.LinkedList;

import java.util.PriorityQueue;

public class MergeKList {
    /*
Heap Advantage: A min-heap allows us to get the smallest element in
𝑂(log𝑘) time, where k is the number of lists.
This is more efficient than scanning all k lists to find the minimum, which would take
𝑂(𝑘)  time     */
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (ListNode listNode : lists) {
            while (listNode != null) {
                minHeap.add(listNode.val);
                listNode = listNode.next;
            }
        }
        ListNode dummy = new ListNode(1);
        ListNode merge = dummy;

        while (!minHeap.isEmpty()) {
            merge.next = new ListNode(minHeap.remove());
            merge = merge.next;
        }
        return dummy.next;
    }
}
