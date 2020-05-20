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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode head = root;
        List<Integer> lis = new ArrayList<Integer>();
        Convert(head, lis);
        //Collections.sort(lis);
        //System.out.println(lis.size());
        return lis.get(k-1);
    }
    
    public void Convert(TreeNode head,List<Integer> lis){
        if(head == null){
            return;
        }
        Convert(head.left, lis);
        lis.add(head.val);
        //System.out.println(head.val);
        Convert(head.right,lis);
    }
}


Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3