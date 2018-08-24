package tree.utils;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class BinaryTree extends UtilsImp{

	public static void insert(TreeNode root, int value) {
		if (root.getLeftNode() == null) {
			root.setLeftNode(new TreeNode(value));
			System.out.println("Node "+ value +" added to left of" + root.getData());
		} else if (root.getRightNode() == null) {
			root.setRightNode(new TreeNode(value));
			System.out.println("Node "+ value +" added to right of" + root.getData());
		}
		else {
			if (root.getLeftNode() != null && root.getRightNode() == null) {
					insert(root, value);
			} else {
				insert(root.getLeftNode(), value);
			}
		}
	}

	public static void delete(Object value) {
		
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		insert(root, 2);
		insert(root, 3);
		insert(root, 4);
		insert(root, 5);
		insert(root, 6);
		insert(root, 7);
		insert(root, 8);
		
		UtilsImp utils = new UtilsImp();
		utils.preOrder(root);
	}
}
