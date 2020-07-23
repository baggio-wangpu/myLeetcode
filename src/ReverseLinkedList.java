import Common.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList1(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode p = head, q = p.next, start = q.next;
        if(start == null) {
            q.next = p;
            p.next = null;
            head = q;
        }else {
            while (q != null) {
                start = q.next;
                q.next = p;
                if (p == head) p.next = null;
                p = q;
                q = start;
            }
            head = p;
        }
        return head;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    /*
    recursion
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode nextNode = head.next;
        ListNode newNode = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newNode;
    }
}
