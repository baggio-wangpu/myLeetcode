import Common.ListNode;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListIITest {

    @Test
    public void deleteDuplicates() {
        RemoveDuplicatesFromSortedListII utils = new RemoveDuplicatesFromSortedListII();
        int[] a1 = {2,3,3,4,4,5};
        ListNode head1 = createListNode(a1);
        printListNode(head1);
        System.out.println();
        printListNode(utils.deleteDuplicates(head1));

        int[] a2 = {1,1,2,2,2,3};
        ListNode head2 = createListNode(a2);
        printListNode(head2);
        System.out.println();
        printListNode(utils.deleteDuplicates(head2));

        int[] a3 = {1,1};
        ListNode head3 = createListNode(a3);
        printListNode(head3);
        System.out.println();
        printListNode(utils.deleteDuplicates(head3));

        int[] a4 = {1,1,2,2};
        ListNode head4 = createListNode(a4);
        printListNode(head4);
        System.out.println();
        printListNode(utils.deleteDuplicates(head4));

        int[] a5 = {};
        ListNode head5 = createListNode(a5);
        printListNode(head5);
        System.out.println();
        printListNode(utils.deleteDuplicates(head5));

        int[] a6 = {2};
        ListNode head6 = createListNode(a6);
        printListNode(head6);
        System.out.println();
        printListNode(utils.deleteDuplicates(head6));


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