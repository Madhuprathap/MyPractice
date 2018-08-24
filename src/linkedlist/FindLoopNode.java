package linkedlist;

public class FindLoopNode {
	
	public static void main(String[] args) {
		FindLoopNode findLoopNode = new FindLoopNode();
		Node root = new Node("madhu");
		insertNode("giri",root);
		insertNode("prathap",root);
		insertNode("ravi",root);
		insertNode("kumar",root);
		insertNode("ramesh",root);
		insertNode("abhi",root);
		root.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = root.nextNode;
		
		detectLoop(root);
		
		displayList(root);
		
	}

	private static void detectLoop(Node root) {
		Node first = root;
		Node second = root.nextNode;
		while (second != null && !first.equals(second)) {
			first = first.nextNode;
			if (second.nextNode != null) {
				second = second.nextNode.nextNode;
			} else {
				second = second.nextNode;
			}
		}
		if (second == null) {
			System.out.println("No loop");
		} else if (first.equals(second)) {
			System.out.println("Loop found: " + first.value);
			
			//Finding loop node
			Node tmp1 = root;
			Node tmp2 = first.nextNode;
			while ( !tmp1.equals(tmp2) ){
				tmp1 = tmp1.nextNode;
				tmp2 = tmp2.nextNode;
			}
			System.out.println("Loop starting nod value: "+tmp1.value);
			
			//breaking loop
			tmp2 = tmp2.nextNode;
			while (tmp2.nextNode!=tmp1) {
				tmp2 = tmp2.nextNode;
			}
			tmp2.nextNode = null;
			
		}
	}

	private static void displayList(Node root) {
		while (root.nextNode != null) {
			System.out.println(root.value);
			root = root.nextNode;
		}
		System.out.println(root.value);
		
	}

	private static void insertNode(String value, Node root) {
		if (root.nextNode == null) {
			root.nextNode = new Node(value);
		} else {
			insertNode(value, root.nextNode);
		}
	}
}
