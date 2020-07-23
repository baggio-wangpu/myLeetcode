import Common.ListNode;

/*
    Given a linked list, remove the n-th node from the end of list and return its head.

    Example:

    Given linked list: 1->2->3->4->5, and n = 2.

    After removing the second node from the end, the linked list becomes 1->2->3->5.

 */
public class RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd1(ListNode head, int n) {

        int len = 1;
        ListNode tail = head;
        ListNode p = head, prev = head;
        while(tail.next != null) {
            tail = tail.next;
            len++;
        }

        while((len - n) != 0) {
            prev = p;
            p = p.next;
            len--;
        }

        if(prev == p) return p.next;
        else if(p == tail) prev.next = null;
        else prev.next = p.next;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;

        while(n-- != 0) fast = fast.next;
        if(fast == null) return head.next;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
