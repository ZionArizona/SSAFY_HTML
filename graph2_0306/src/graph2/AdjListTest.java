package graph2;

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
		bfs(0);
		
	} //main
	
	private static void bfs(int start) {
		
		// 하나도 빠짐없이 모든 정점 탐색
		Queue<Integer> queue = new ArrayDeque<>();  // 탐색할 순서 및 그에 필요한 정보(탐색할 정점 인덱스 등) 관리
		boolean[] visited = new boolean[V];  // V개 정점의 방문(혹은 찜콩) 여부 관리
		
		
		visited[start] = true;
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			int current = queue.poll(); // 탐색할 대상 꺼내기
			//탐색해서 해야할 일 처리
			System.out.println((char)(current+65));
			
			// 자신의 인접정점들을 다음 탐색이 가능하도록 관리해줌
			for(Node temp = adjList[current]; temp != null ; temp = temp.next) {
				if(visited[temp.to]) continue;
				
				visited[temp.to] = true;
				queue.offer(temp.to);
				
			}
			
			
			
			
		}
		
		
		
	} // bfs
}
