import Common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesSortedListTest {

    @Test
    public void deleteDuplicates() {

        int[] a = {1,1,1,2,2,2,2,3,3,4,5,6,6,7};
        RemoveDuplicatesSortedList list = new RemoveDuplicatesSortedList();
        ListNode head = createListNode(a);
        printListNode(head);
        printListNode(list.deleteDuplicates(head));
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
