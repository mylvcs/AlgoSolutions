/*
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's 
key.
The right subtree of a node contains only nodes with keys greater than the 
node's key.
Both the left and right subtrees must also be binary search trees.
Example 1:
    2
   / \
  1   3
Binary tree [2,1,3], return true.
Example 2:
    1
   / \
  2   3
Binary tree [1,2,3], return false.
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
public class ValidateBinaryTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            TreeNode cur = root.left; // search the max node value of left tree.
            while (cur.right != null) {
                if (cur.val >= cur.right.val) {
                    return false;
                }
                cur = cur.right;
            }
            if (cur.val >= root.val) {
                return false;
            }
        }
        if (root.right != null) {
            TreeNode cur = root.right; // search the min node value of right tree.
            while (cur.left != null) {
                if (cur.val <= cur.left.val) {
                    return false;
                }
                cur = cur.left;
            }
            if (cur.val <= root.val) {
                return false;
            }
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }

}
