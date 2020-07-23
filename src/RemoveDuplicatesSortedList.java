import Common.ListNode;

public class RemoveDuplicatesSortedList {

    /*
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode p = head;
        while(p != null) {
            for(ListNode q = p.next; q != null; q = q.next) {
                if (p.val == q.val) {
                    p.next = q.next;
                }
            }
            p = p.next;
        }
        return head;
    }
    */

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode p = head;
        while(p != null) {
            for(ListNode q = p.next; q != null; q = q.next) {
                if (p.val == q.val) {
                    p.next = q.next;
                } else {
                    break;
                }
            }
            p = p.next;
        }
        return head;
    }

}
