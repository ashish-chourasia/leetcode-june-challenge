package solutions;

public class Day15_SearchInBinaryTree {

	public static TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return root;
		}
		if (root.val == val) {
			return root;
		} 
		else {
			return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
		}
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(2);
		node.right = new TreeNode(7);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(3);
	}

}
