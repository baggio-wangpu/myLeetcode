import Common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndofListTest {

    @Test
    public void removeNthFromEndTest() {

        RemoveNthNodeFromEndofList utils = new RemoveNthNodeFromEndofList();
        int[] a = {2, 3, 4, 5};
        ListNode head1 = createListNode(a);
        printListNode(head1);
        System.out.println();
        printListNode(utils.removeNthFromEnd(head1, 2));

        ListNode head2 = createListNode(a);
        printListNode(head2);
        System.out.println();
        printListNode(utils.removeNthFromEnd(head2, 5));

        int[] b = {3,7,9,3,5,8,0};
        ListNode head3 = createListNode(b);
        printListNode(head3);
        System.out.println();
        printListNode(utils.removeNthFromEnd(head3, 1));

    }

    private ListNode createListNode(int[] array) {

        ListNode head = new ListNode(1);
        ListNode p = head;
        for(int e : array) {
            ListNode node = new ListNode(e);
            p.next = node;
            p = p.next;
        }
        return head;
    }

    private void printListNode(ListNode node) {
        while(node != null) {
            System.out.print(" " + node.val);
            node = node.next;
        }
        System.out.println();
    }

}