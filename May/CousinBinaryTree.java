/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class CheckCousin{
        int depth;
        int parent;
    }
    CheckCousin xc = new CheckCousin();
    CheckCousin yc = new CheckCousin();
    int x,y;
    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        check(root,0,1);
        return xc.depth == yc.depth && xc.parent != yc.parent;
    }
    
    private void check(TreeNode root, int parent, int depth) {
        if (root == null) {
            return;
        }

        if (root.val == x) {
            xc.parent = parent;
            xc.depth = depth;
        }
        if (root.val == y) {
            yc.parent = parent;
            yc.depth = depth;
        }
        check(root.left, root.val, depth + 1);
        check(root.right, root.val, depth + 1);
    }
    
}


