import Common.ListNode;

public class MergeTwoSortedLists {

    /*
        Input: 1->2->4, 1->3->4
        Output: 1->1->2->3->4->4
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode p1 = l1, p2 = l2; // The start of L2
        ListNode head = l2;  // The start of return list
        ListNode tail1 = l1, tail2 = l2;
        ListNode prev = p2;

        while(tail1.next != null) tail1 = tail1.next;
        while(tail2.next != null) tail2 = tail2.next;

        if(tail1.val <= p2.val) {
            head = p1;
            tail1.next = p2;
        } else if(tail2.val <= p1.val) {
            head = p2;
            tail2.next = p1;
        } else {
            while(p1 != null) {
                while (p2 != null && p1.val >= p2.val) {
                    prev = p2;
                    p2 = p2.next;
                }
                if (p2 == head) {
                    ListNode p = p1;
                    p1 = p1.next;
                    p.next = p2;
                    head = p;
                } else if(p2 == null) {
                    prev.next = p1;
                    return head;
                } else {
                    ListNode p = p1;
                    p1 = p1.next;
                    p.next = p2;
                    prev.next = p;
                    prev = p;
                }
            }
        }
        return head;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        /** l1和l2均非空 */
        ListNode p1 = l1;
        ListNode p2 = l2;
        //先找出l1和l2的头结点中 较小的结点作为新链表的head
        ListNode head = null;
        if(l1.val < l2.val){
            head = l1;
            p1 = p1.next;
        } else {
            head = l2;
            p2 = p2.next;
        }
        //新链表的p指针
        ListNode p = head;

        //当p1和p2都不为空时
        while (p1 != null && p2 != null){
            if(p1.val < p2.val){
                p.next = p1;
                p = p.next;
                p1 = p1.next;
            } else {
                p.next = p2;
                p = p.next;
                p2 = p2.next;
            }
        }

        if(p1 == null){
            p.next = p2;
        }else {
            p.next = p1;
        }

        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
