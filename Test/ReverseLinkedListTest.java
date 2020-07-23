import Common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ReverseLinkedList utils = new ReverseLinkedList();
        int[] a = {2,3,4,5};
        ListNode head1 = createListNode(a);
        printListNode(head1);
        System.out.println();
        printListNode(utils.reverseList(head1));
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