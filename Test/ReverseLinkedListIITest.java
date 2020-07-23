import Common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListIITest {

    @Test
    public void reverseBetween() {
        ReverseLinkedListII utils = new ReverseLinkedListII();
        int[] a = {2,3,4,5};
        ListNode head1 = createListNode(a);
        printListNode(head1);
        System.out.println();
        printListNode(utils.reverseBetween(head1, 2, 4));
    }

    @Test
    public void reverseBetween2() {
        ReverseLinkedListII utils = new ReverseLinkedListII();
        int[] a = {2};
        ListNode head1 = createListNode(a);
        printListNode(head1);
        System.out.println();
        printListNode(utils.reverseBetween(head1, 1, 2));
    }

    @Test
    public void reverseBetween3() {
        ReverseLinkedListII utils = new ReverseLinkedListII();
        int[] a = {2,3};
        ListNode head1 = createListNode(a);
        printListNode(head1);
        System.out.println();
        printListNode(utils.reverseBetween(head1, 3, 3));
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