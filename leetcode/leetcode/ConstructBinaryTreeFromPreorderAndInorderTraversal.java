/*
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
    }

    public TreeNode buildTree(int[] preorder, int pStart, int pEnd, 
            int[] inorder, int iStart, int iEnd) {
        if (preorder == null || pStart < 0 || pEnd >= preorder.length 
                || pStart > pEnd || inorder == null || iStart < 0 
                || iEnd >= inorder.length || iStart > iEnd || pEnd - pStart != iEnd - iStart) {
            return null;
        }
    }

}
