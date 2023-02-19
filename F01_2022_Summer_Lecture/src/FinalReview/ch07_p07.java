package review;

import java.util.Queue;
import java.util.LinkedList;

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class ch07_p07 {
	Node root;
	
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		
		while(!Q.isEmpty()) {
			int size = Q.size();
			
			for(int i=0; i<size; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				
				if(cur.lt != null)
					Q.offer(cur.lt);
				if(cur.rt != null)
					Q.offer(cur.rt);	
			}
			
		}
	}

	public static void main(String[] args) {
		ch07_p07 tree = new ch07_p07();
		
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		
		tree.BFS(tree.root);
	}

}
