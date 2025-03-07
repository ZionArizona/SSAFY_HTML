package graph1_0305;
import java.util.*;
import java.io.*;

//무향 그래프, 연결 리스트 버전
public class AdjListTest {
	
	static class Node{
		int to, weight;
		
		Node next;

		public Node(int to, int weight, Node next) {
			super();
			this.to = to;
			this.weight = weight;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return "Node [to=" +to + ", weight=" + weight +", next=" + next + "]";
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
			int weight = sc.nextInt();
			adjList[from] = new Node(to, weight, adjList[from]);
			adjList[to] = new Node(from, weight, adjList[to]);
		}
		
		for(Node head : adjList) {
			System.out.println(head);
		
		}
		
		
	} //main
	
	
}


/*
7
8
0 1 10
0 2 6
0 5 7
0 6 3
4 3 6
5 3 8
5 4 9
6 4 20
*/
