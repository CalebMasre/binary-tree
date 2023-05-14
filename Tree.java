public class Tree<T extends Comparable<T>> {
	private TreeNode<T> root;

// constructor initializes an empty Tree of integers
	public Tree() {
		root = null;
	}

// insert a new node in the binary search tree
	public void insertNode(T insertValue) {
		if (root == null) {
			root = new TreeNode<>(insertValue);
		} else {
			root.insert(insertValue); // call the insert method
		}
	}
// begin preorder traversal

	public void preorderTraversal() {
		preorderHelper(root);
	}

// recursive method to perform preorder traversal
	private void preorderHelper(TreeNode<T> node) {
		if(node == null)
			return;
		System.out.print(node.data + " ");
		preorderHelper(node.leftNode);
		preorderHelper(node.rightNode);

	}
	public void inorderTraversal() {
		inorderHelper(root);
	}

// recursive method to perform inorder traversal
	private void inorderHelper(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		
		
		
		
		inorderHelper(node.leftNode);
		System.out.print(node.data + " ");
		inorderHelper(node.rightNode);
		
		
		
		// traverse left subtree System.out.printf("%s ", node.data); // output node
										// data inorderHelper(node.rightNode); // traverse right subtree
	}

// begin postorder traversal
	public void postorderTraversal() {
		postorderHelper(root);
	}

// recursive method to perform postorder traversal
	private void postorderHelper(TreeNode<T> node) {
		if(node == null)
			return;
		postorderHelper(node.leftNode);
		postorderHelper(node.rightNode);
		System.out.print(node.data + " ");
		
	}
}
