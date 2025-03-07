package graph2;
import java.util.*;
import java.io.*;

public class Solution {
	
	static int ans;
	static char[][] arr;
	static int[][] map;
	static boolean[][] visited;
	static int N;
	static int[] drow = {-1,1,0,0,-1,1,-1,1};  // 상   하    좌   우   좌상   좌하   우상   우하
	static int[] dcol = {0,0,-1,1,-1,-1,1,1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int test = 1; test <= T; test++) {
			N = Integer.parseInt(br.readLine());
			
			arr = new char[N][N];
			map = new int[N][N];
			visited = new boolean[N][N];
			
			for(int i = 0; i < N; i++) {
				String str = br.readLine();
				for(int j = 0; j < N; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			ans = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					//System.out.print(arr[i][j] + " ");
					if(arr[i][j] == '.' && chkZero(i,j)) {
						//arr[i][j] = '!';
						//go(i,j);
						//visited[i][j] = true;
						ans++;
						go(i,j);
					}
				}
				//System.out.println();
			}
			
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == '.') {
						ans++;
					}
					//System.out.print(arr[i][j] + " ");
				}
				//System.out.println();
			}
			
			sb.append("#"+ test + " " + ans + "\n");
			
		}
		
		
		System.out.println(sb);
		
	} // main
	
	static void go(int row, int col) {
		
		visited[row][col] = true;
		
		for(int i = 0; i < 8; i++) {
			
			
			int nextrow = row + drow[i];
			int nextcol = col + dcol[i];
			
			if(nextrow >=0 && nextrow < N && nextcol >= 0 && nextcol < N && !visited[nextrow][nextcol]) {
				
				if(chkZero(nextrow, nextcol)) {
					arr[nextrow][nextcol] = '!';
					go(nextrow, nextcol);
				}
				else {
					arr[nextrow][nextcol] = 'A';
					visited[nextrow][nextcol] = true;
				}
				
			}
			
			
		}
		
		
		
		
	} //go
	
	static boolean chkZero(int row, int col) {
		
		for(int i = 0; i < 8; i++) {
			
			int nextrow = row + drow[i];
			int nextcol = col + dcol[i];
			
			if(nextrow >= 0 && nextrow < N && nextcol >= 0 && nextcol < N) {
				if(arr[nextrow][nextcol] == '*') {
					return false;
				}
			}
			
		}
		//visited[row][col] = true;
		arr[row][col] = '!';
		return true;
	} // chkZero
	
}
