// L100

import Common.TreeNode;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(null == p && null == q) {
            return true;
        } else if(null != p && null == q) {
            return false;
        } else if(null == p) {
            return false;
        } else if(p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
