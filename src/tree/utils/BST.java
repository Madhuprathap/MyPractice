package tree.utils;

public class BST extends UtilsImp{
	
	public static void insert(TreeNode root, int value) {
		if (value > root.getData()) {
			if (root.getRightNode() != null) {
				insert(root.getRightNode(), value);
			} else {
				System.out.println("Value " + value + " is added as Right child of " + root.getData());
				root.setRightNode(new TreeNode(value));
			}
		} else {
			if (root.getLeftNode() != null) {
				insert(root.getLeftNode(), value);
			} else {
				System.out.println("Value " + value + " is added as Left child of " + root.getData());
				root.setLeftNode(new TreeNode(value));
			}
		}
	}
	
	public static TreeNode delete(TreeNode root, int value) {
		TreeNode tmp = null;
		if(value > root.getData()) {
			root.setRightNode(delete(root.getRightNode(), value));
		} else if (value < root.getData()) {
			root.setLeftNode(delete(root.getLeftNode(), value));
		} else { // found element
			if (root.getRightNode() != null && root.getLeftNode() != null) {
				tmp = FindMax(root.getLeftNode());
				root.setData(tmp.getData());
				root.setLeftNode(delete(root.getLeftNode(), root.getData()));
			} else {
				if (root.getRightNode() == null && root.getLeftNode() == null) {
					root = null;
				}else {
					if (root.getRightNode() != null) {
						root = root.getRightNode();
					} else if (root.getLeftNode() != null) {
						root = root.getLeftNode();
					}
				}
			}
		}
		
		return root;
		
	}
	
	private static TreeNode FindMax(TreeNode root) {
		while (root.getRightNode() != null) {
			root = root.getRightNode();
		}
		return root;
	}

	public static void main(String[] args) {
		UtilsImp utils = new UtilsImp();
		TreeNode root = new TreeNode(10);
		System.out.println("Tree with root Node value: " + root.getData());
		insert(root, 2);
		insert(root, 5);
		insert(root, 8);
		insert(root, 15);
		insert(root, 13);
		insert(root, 20);
		
		utils.inOrder(root);
		System.out.println("========");
		delete(root, 8);
		System.out.println("After delete ");
		utils.inOrder(root);
		System.out.println("========");
		System.out.println(FindMax(root).getData());
		
	}
}
