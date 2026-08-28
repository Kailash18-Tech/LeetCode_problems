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
    int sum = 0 ;
    public void rangesum(TreeNode root , int low , int high , int sum ){

        if( root == null) return;

        if( low < root.val && root.val < high ){
            this.sum+=root.val;
            rangesum( root.left , low , high , sum );
            rangesum( root.right , low , high , sum );
        }
        else if( root.val <= low)
            rangesum( root.right , low , high , sum );
        else
            rangesum( root.left , low , high , sum );

       
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
     
        rangesum( root , low , high , sum );
        return this.sum + low + high;
    }
}