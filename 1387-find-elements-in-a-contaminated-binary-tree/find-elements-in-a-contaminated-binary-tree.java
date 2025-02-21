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
class FindElements {
    Set<Integer> nodeValues = new HashSet<>();
    public FindElements(TreeNode root) {
        if(root != null){
            root.val = 0;
            nodeValues.add(0);
            recoveryBinaryTree(root.left, 1);
            recoveryBinaryTree(root.right, 2);
        }
    }
    public void recoveryBinaryTree(TreeNode curr, int val){
        if(curr == null){
            return;
        }
        curr.val = val;
        nodeValues.add(val);
        recoveryBinaryTree(curr.left, 2 * val + 1);
        recoveryBinaryTree(curr.right, 2 * val + 2);
    }
    
    public boolean find(int target) {
        return nodeValues.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */