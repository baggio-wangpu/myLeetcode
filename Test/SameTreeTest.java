import Common.TreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SameTreeTest {

    // 创建二叉树
    public List<TreeNode> createBintree(int[] array) {

        if(array.length == 0) {
            return null;
        }

        List<TreeNode> nodeList = new LinkedList<>();

        // 将数组的值转换为node
        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
            nodeList.add(new TreeNode(array[nodeIndex]));
        }

        // 对除最后一个父节点按照父节点和孩子节点的数字关系建立二叉树
        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
            nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);
            nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
        }

        // 最后一个父节点
        int lastParentIndex = array.length / 2 - 1;

        // 左孩子
        nodeList.get(lastParentIndex).left = nodeList.get(lastParentIndex * 2 + 1);

        // 如果为奇数，建立右孩子
        if (array.length % 2 == 1) {
            nodeList.get(lastParentIndex).right = nodeList.get(lastParentIndex * 2 + 2);
        }
        return nodeList;
    }

    // 中序遍历
    public static void inOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        System.out.print(node.val + " ");
        inOrderTraverse(node.right);
    }

    @Test
    public void isSameTreeTest() {
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        List<TreeNode> nodeList1 = createBintree(array1);
        TreeNode tree1 = nodeList1 == null ? null : nodeList1.get(0);
        inOrderTraverse(tree1);

        System.out.print("\n");

        List<TreeNode> nodeList2 = createBintree(array2);
        TreeNode tree2 = nodeList2 == null ? null : nodeList2.get(0);
        inOrderTraverse(tree2);
        SameTree sameTree = new SameTree();
        assertTrue(sameTree.isSameTree(tree1, tree2));
    }
}