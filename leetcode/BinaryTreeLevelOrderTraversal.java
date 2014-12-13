/*
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 * For example:
 * Given binary tree {3,9,20,#,#,15,7},

 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:

 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ] 
 /**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<TreeNode> cur = new ArrayList<TreeNode>();
        if (root != null)
            cur.add(root);
        while (!cur.isEmpty()) {
            List<Integer> list = new ArrayList<Integer>();
            List<TreeNode> next = new ArrayList<TreeNode>();
            for (TreeNode node : cur) {
                list.add(node.val);
                if (node.left != null) 
                    next.add(node.left);
                if (node.right != null)
                    next.add(node.right);
            }
            result.add(list);
            cur = next;
        }
        return result;
    }

/****************************** updated 2013/12/02 ********************************/
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root != null) {
            Queue<TreeNode> curLevel = new LinkedList<TreeNode>();
            Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
            ArrayList<Integer> saveNodeVal = new ArrayList<Integer>();
            curLevel.offer(root);
            while(!curLevel.isEmpty()) {
                TreeNode cur = curLevel.poll();
                if(cur.left != null)
                    nextLevel.offer(cur.left);
                if(cur.right != null)
                    nextLevel.offer(cur.right);
                saveNodeVal.add(cur.val);
                if(curLevel.isEmpty()) {
                    res.add(saveNodeVal);
                    saveNodeVal = new ArrayList<Integer>();
                    curLevel = nextLevel;
                    nextLevel = new LinkedList<TreeNode>();
                }
            }
        }
        return res;
    }
}
