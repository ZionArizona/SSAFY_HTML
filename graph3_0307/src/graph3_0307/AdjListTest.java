package graph3_0307;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class AdjListTest {
	static class Node{
		int to;
		
		Node next;

		public Node(int to, Node next) {
			super();
			this.to = to;

			this.next = next;
		}
		
		@Override
		public String toString() {
			return "Node [to=" +to + ", next=" + next + "]";
		}
		
		
	}
	
	
	static Node[] adjList;
	static int V;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		
		int E = sc.nextInt();
		
		adjList = new Node[V];
		for(int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();

			adjList[from] = new Node(to,  adjList[from]);
			adjList[to] = new Node(from,  adjList[to]);
		}
		
//		for(Node head : adjList) {
//			System.out.println(head);
//		
//		}
		dfs(0,new boolean[V]);
		
	} //main
	
	private static void dfs(int current, boolean[] visited) {
		
		visited[current] = true;
		System.out.println((char)(current+65));
		for(Node temp = adjList[current]; temp != null; temp = temp.next) {
			if(visited[temp.to]) continue;
			
			dfs(temp.to, visited);
			
		}
		
		
		
	} // bfs
}
