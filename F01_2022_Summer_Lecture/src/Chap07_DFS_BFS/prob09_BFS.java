package chap07;

import java.util.Queue;
import java.util.LinkedList;

public class prob09_BFS {
	Node root;
	
	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int answer = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				if(cur.lt == null && cur.rt == null)
					return answer;
				if(cur.lt != null)
					Q.offer(cur.lt);
				if(cur.rt != null) 
					Q.offer(cur.rt);
			}
			answer++;
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		prob09_BFS tree = new prob09_BFS();
		
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		
		System.out.println(tree.BFS(tree.root));
	}

}
