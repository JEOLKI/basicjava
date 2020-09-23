package i_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<>();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		while (!st.empty()) {
			System.out.println(st.pop());
		}
		
		
		System.out.println("========================================================================");
		
		Queue<String> qu = new LinkedList<>();
		qu.offer("0");
		qu.offer("1");
		qu.offer("2");
		
		while (!qu.isEmpty()) {
			System.out.println(qu.poll());
			
		}
		
		
		
		
	}
}
