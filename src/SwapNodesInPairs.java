import Common.ListNode;

public class SwapNodesInPairs {

    public ListNode swapPairs2(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode first = head;
        head = head.next;
        ListNode p;
        while(true) {
            ListNode second = first.next;
            p = second.next;
            second.next = first;
            if(p != null && p.next != null) {
                first.next = p.next;
                first = p;
            }
            else {
                first.next = p;
                break;
            }
        }
        return head;
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode second = head.next;
        ListNode third = second.next;
        second.next = head;

        head.next = swapPairs(third);
        return second;
    }
}
