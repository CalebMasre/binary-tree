//class TreeNode definition
public class TreeNode<T extends Comparable<T>> { // package access members
TreeNode<T> leftNode; // left node
T data; // node value
TreeNode<T> rightNode; // right node
// constructor initializes data and makes this a leaf node
public TreeNode(T nodeData) {
data = nodeData;
leftNode = rightNode = null; // node has no children
}

// locate insertion point and insert new node; ignore duplicate values
public void insert(T insertValue) {
	
	
	if(insertValue.compareTo(data) > 0) {
		if(rightNode == null) {
			rightNode = new TreeNode(insertValue);
		} else {
			rightNode.insert(insertValue);
		}
		
	} 
	else if(insertValue.compareTo(data) < 0) {
		if(leftNode == null) {
			leftNode = new TreeNode(insertValue);
		} else {
			leftNode.insert(insertValue);
		}
		
	} else {
		System.out.println("ERROR!!! " + data + " is already in the tree");
	}

}
}
