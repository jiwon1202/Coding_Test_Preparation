package chap03_Stack_Queue;

import java.util.Stack;
import java.util.ArrayList;

public class Q03_ColidingSequences {
	public ArrayList<Integer> solution(int[] nums) {
		ArrayList<Integer> answer = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		for (int n : nums) {
			if (n > 0) {
				stack.push(n);
			}
			else {
				if (stack.isEmpty() || stack.peek() < 0) {
					stack.push(n);
				}
				else {
					boolean flag = true;
					while(!stack.isEmpty() && stack.peek() > 0) {
						int tmp = stack.pop();
						if (Math.abs(n) > tmp) {	
							flag = true;
						}
						else if (Math.abs(n) == tmp) {
							flag = false;
							break;
						}
						else {
							stack.push(tmp);
							flag = false;
							break;
						}
					}
					if (flag) {
						stack.push(n);
					}
				}
			}
		}
		for (int n : stack)
			answer.add(n);

		return answer;
	}
	public static void main(String[] args) {
		Q03_ColidingSequences T = new Q03_ColidingSequences();
		
		int[] arr1 = new int[] {3, 5, -2, -5};
		System.out.println(T.solution(arr1));
		
		int[] arr2 = new int[] {-2, -1, -3, 1, 3};
		System.out.println(T.solution(arr2));
		
		int[] arr3 = new int[] {-2, -1, 2, 1, -3, 2};
		System.out.println(T.solution(arr3));
	}
}