import Common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {

        MergeTwoSortedLists Utils = new MergeTwoSortedLists();
        int[] a = {2, 4};
        ListNode head1 = createListNode(a);
        printListNode(head1);

        int[] b = {3, 4};
        ListNode head2 = createListNode(b);
        printListNode(head2);

        printListNode(Utils.mergeTwoLists(head1, head2));
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
