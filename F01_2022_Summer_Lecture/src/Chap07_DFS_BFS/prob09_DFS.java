package chap07;

public class prob09_DFS {
	Node root;
	
	public int DFS(Node root, int L) {
		if(root == null || root.lt == null && root.rt == null) {
			return L;
		}
		else {
			return Math.min(DFS(root.lt, L+1), DFS(root.rt, L+1));
		}
	}

	public static void main(String[] args) {
		prob09_DFS tree = new prob09_DFS();
		
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		System.out.println(tree.DFS(tree.root, 0));
	}

}
