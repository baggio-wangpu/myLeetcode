import Common.ListNode;

public class RemoveDuplicatesFromSortedListII {

    /*
    Example 1:

    Input: 1->2->3->3->4->4->5
    Output: 1->2->5
     */
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode prev = dump, cur = head;

        while(cur != null) {
            while(cur.next != null && cur.val == cur.next.val) cur = cur.next;
            if(prev.next == cur) prev = prev.next;
            else prev.next = cur.next;
            cur = cur.next;
        }

        return dump.next;
    }
}
