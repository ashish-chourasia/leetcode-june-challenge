package solutions;

public class Day01_InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
		// Swap left and right
		root.right = left;
		root.left = right;
		
		return root;
	}
	
	/*
	 * Input: 
	 *   4
	   /   \
	  2     7
	 / \   / \
	1   3 6   9
	
	Output:
	     4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1
	 */

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}