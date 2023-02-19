package review;

public class ch07_p09 {
	Node root;
	
	public int DFS(Node node, int L) {
		if (node == null || node.lt == null && node.rt == null){
			return L;
		}
		else {
			return Math.min(DFS(node.lt, L+1), DFS(node.rt, L+1));
		}
	}
	
	public static void main(String[] args) {
		ch07_p09 tree = new ch07_p09();
		
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);

		System.out.println(tree.DFS(tree.root, 0));
	}
}
