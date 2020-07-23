import Common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {

    @Test
    public void swapPairs() {

        int[] a = {2,3,4};
        ListNode node = createListNode(a);
        printListNode(node);

        SwapNodesInPairs pairs = new SwapNodesInPairs();
        ListNode swapPairs = pairs.swapPairs(node);
        printListNode(swapPairs);

    }

    @Test
    public void swapPairsFor() {

        int[] a = {2,3};
        ListNode node = createListNode(a);
        printListNode(node);

        SwapNodesInPairs pairs = new SwapNodesInPairs();
        ListNode swapPairs = pairs.swapPairs(node);
        printListNode(swapPairs);

    }

    @Test
    public void swapPairsForSepecial() {

        int[] a = {3};
        ListNode node = createListNode(a);
        printListNode(node);

        SwapNodesInPairs pairs = new SwapNodesInPairs();
        ListNode swapPairs = pairs.swapPairs(node);
        printListNode(swapPairs);

    }

    @Test
    public void swapPairsForSepecialOnly() {

        int[] a = {2,3,4,5,6,7};
        ListNode node = createListNode(a);
        printListNode(node);

        SwapNodesInPairs pairs = new SwapNodesInPairs();
        ListNode swapPairs = pairs.swapPairs(node);
        printListNode(swapPairs);

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