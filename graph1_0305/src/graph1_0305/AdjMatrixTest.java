package graph1_0305;
import java.util.*;
import java.io.*;

//무향 그래프
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
			
			adjMatrix[from][to] = adjMatrix[to][from] = 1;
		}
		
		for(int[] a : adjMatrix) {
			System.out.println(Arrays.toString(a));
		}
		
		
	} //main
	
	
}

/*
7
8
0 1
0 2
0 5
0 6
4 3
5 3
5 4
6 4
*/