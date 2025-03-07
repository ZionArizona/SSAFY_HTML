package graph3_0307;
import java.util.*;
import java.io.*;
	
public class AdjMatrixTest {
	
	static int vertext;
	static int edge;
	static int[] indegree;
	static List<Integer> result;
	static Queue<Integer> que;
	static List<List<Integer>> list;
	static boolean[] visited;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int test = 1; test <= 10; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			vertext = Integer.parseInt(st.nextToken());
			edge = Integer.parseInt(st.nextToken());
			
			indegree = new int[vertext+1];
			result = new ArrayList<>();
			list = new ArrayList<List<Integer>>();
			visited = new boolean[vertext+1];
			
			for(int i = 0; i < vertext+1; i++) {
				list.add(new ArrayList<Integer>());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < edge; i++) {
				int c1 = Integer.parseInt(st.nextToken());
				int c2 = Integer.parseInt(st.nextToken());
				
				indegree[c2]++;
				
				list.get(c1).add(c2);
			}
			
			que = new LinkedList<>();
			
			for(int i = 1; i <= vertext; i++) {
				if(indegree[i] == 0 && !visited[i]) {
					que.offer(i);
					visited[i] = true;
					topologesort();				
				}
			}
			
			topologesort();
			System.out.print("#" + test + " ");
			for(int i = 0;  i < result.size(); i++) {
				System.out.print(result.get(i) + " ");
			}
			
		}
		
		
	} //main
	
	
	static void topologesort() {
		
		
		
//		// 큐에 전입 노드가 0인 노드 담기
//		for(int i = 1; i <= vertext; i++) {
//			if(indegree[i] == 0) {
//				que.offer(i);
//			}
//		}
		
		while(!que.isEmpty()) {
			
			int current = que.poll();
			//System.out.println(current);
			result.add(current);
			
			for(int i = 0; i < list.get(current).size(); i++) {
				indegree[list.get(current).get(i)]--;
				
				
				if(indegree[list.get(current).get(i)] == 0 ) {
					visited[list.get(current).get(i)] = true;
					que.offer(list.get(current).get(i));
				}
				

			}
			
			
			
		}
		
		
	} //topologesort
	
	
}

/*




*/