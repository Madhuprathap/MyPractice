package tree.utils;

public class UtilsImp implements Utils{

	@Override
	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.getLeftNode());
			System.out.print(root.getData() + "->");
			inOrder(root.getRightNode());
		}
	}

	@Override
	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.getData() + "->");
			inOrder(root.getLeftNode());
			inOrder(root.getRightNode());
		}
	}

	@Override
	public void postOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.getLeftNode());
			inOrder(root.getRightNode());
			System.out.print(root.getData() + "->");
		}
	}

	

}
