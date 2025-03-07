package graph3_0307;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class FloodFillTest {
	
	private static int N, arr[][];
	private static boolean[][] visited;
	private static int[] drow = {1,1,-1,-1};  // 우하   좌하  좌상  우상
	private static int[] dcol = {1,-1,-1,1};
	private static int fir;
	private static int sec;
	private static int thr;
	private static int four;
	private static Set<Integer> set;
	private static int dir;
	private static int ans;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		
		ans = -1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				set = new HashSet<>();
				fir = 0;
				sec = 0;
				thr = 0;
				four = 0;
				dir = 0;
				set.add(arr[i][j]);
				go(0,0);
				
			}
		}
		
	} // main
	
	
	static void go(int row, int col) {
		
		if(dir == 0) { // 우하일 경우
			int nextrow = row + drow[dir];
			int nextcol = col + dcol[dir];
			
			
			if(nextrow >= 0 && nextrow < N && nextcol >= 0 && nextcol < N && !set.contains(arr[nextrow][nextcol])) {
				fir++;
				set.add(arr[nextrow][nextcol]);
				go(nextrow, nextcol);
			}
			
			dir++;
			
		}
		
		if(dir == 1) { // 두번째 좌하
			int nextrow = row + drow[dir];
			int nextcol = col + dcol[dir];
			
			if(nextrow >= 0 && nextrow < N && nextcol >= 0 && nextcol < N && !set.contains(arr[nextrow][nextcol])) {
				sec++;
				set.add(arr[nextrow][nextcol]);
				go(nextrow, nextcol);
			}
			dir++;
			
		}
		
		if(dir == 2) { // 세번째 좌상
			if(fir == 0 && sec == 0) return;
			
			int nextrow = 0;
			int nextcol = 0;
			
			for(int i = 0;  i < fir; i++) {
				nextrow = row + drow[dir];
				nextcol = col + dcol[dir];
				
				
				if(nextrow >= 0 && nextrow < N && nextcol >= 0 && nextcol < N && !set.contains(arr[nextrow][nextcol])) {
					thr++;
					set.add(arr[nextrow][nextcol]);
					continue;
				}
				else {
					return;
				}
				
			}
			dir++;
			go(nextrow, nextcol);
			
		}
		
	} // go
	
	
}