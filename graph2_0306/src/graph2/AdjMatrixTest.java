package graph2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class AdjMatrixTest {
	static int[][] adjMatrix;
	static int V;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		
		int E = sc.nextInt();
		
		adjMatrix = new int[V][V];
		for(int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			adjMatrix[to][from] = adjMatrix[from][to] = 1;
		}
		
		//bfs(0);
		
		
//		for(int[] a : adjMatrix) {
//			System.out.println(Arrays.toString(a));
//		}
		
		bfs2(0);
		
		
		
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
			for(int i = 0;i < V; i++) {
				if(adjMatrix[current][i] != 1 || visited[i]) continue; // 인접하지 않은 점점이거나 방문된 상태이면 skip
				
				//인접하고 방문하지 않은 정점일 경우
				visited[i] = true;
				queue.offer(i);
				
			}
			
		}
		
		
		
	} // bfs
	
	
	// 하나도 빠짐 없이 모든 정점 탐색, 해당 정점에 대해
	private static void bfs2(int start) {
		
		// 하나도 빠짐없이 모든 정점 탐색
		Queue<Integer> queue = new ArrayDeque<>();  // 탐색할 순서 및 그에 필요한 정보(탐색할 정점 인덱스 등) 관리
		int[] visited = new int[V];  // V개 정점의 방문(혹은 찜콩)의 너비를 저장
		Arrays.fill(visited, -1);
		
		visited[start] = 0;
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			int current = queue.poll(); // 탐색할 대상 꺼내기
			//탐색해서 해야할 일 처리
			System.out.println((char)(current+65) + ":" + visited[current]);
			
			// 자신의 인접정점들을 다음 탐색이 가능하도록 관리해줌
			for(int i = 0;i < V; i++) {
				if(adjMatrix[current][i] != 1 || visited[i] >-1) continue; // 인접하지 않은 점점이거나 방문된 상태이면 skip
				
				//인접하고 방문하지 않은 정점일 경우
				visited[i] = visited[current]+1;
				queue.offer(i);
				
			}
			
		}
		
		
		
	} // bfs2
	
	
}



/*
 * 
 * 
 * 7
8
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6
 * 
 * 
 * 
 */

