import Common.ListNode;

public class ReverseLinkedListII {

    /*
    Input: 1->2->3->4->5->NULL, m = 2, n = 4
    Output: 1->4->3->2->5->NULL
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        ListNode prev = null, ListM;
        ListNode curr = head;
        int count = 1;

        while(count < m) {
            count++;
            prev = curr;
            curr = curr.next;
        }
        ListM = curr;
        ListNode prev2 = null;

        while(count <= n) {
            ListNode temp = curr.next;
            curr.next = prev2;
            prev2 = curr;
            curr = temp;
            count++;
        }

        ListM.next = curr;
        if(prev != null) {
            prev.next = prev2;
        } else {
            head = prev2;
        }
        return head;
    }
}
