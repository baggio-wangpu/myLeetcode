import Common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists {

  public ListNode mergeKLists(ListNode[] lists) {

    PriorityQueue<ListNode> pq =
        new PriorityQueue<>(Comparator.comparingInt(list -> list.val));

    for (ListNode node : lists) {
      while (node != null) {
        pq.offer(node);
        node = node.next;
      }
    }

    ListNode head = new ListNode(0);
    ListNode tail = head;

    while (!pq.isEmpty()) {
      ListNode cur = new ListNode(pq.poll().val);
      tail.next = cur;
      tail = cur;
    }

    return head.next;
  }

  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
    for (int num : nums) {
      pq.offer(num);
    }

    while (k > 0) {
      pq.poll();
      k--;
    }
    return pq.peek();
  }

}
