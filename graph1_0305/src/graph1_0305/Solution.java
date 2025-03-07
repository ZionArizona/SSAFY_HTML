package graph1_0305;
import java.util.*;
import java.io.*;


public class Solution {
	
	static class customer{
		int x;
		int y;
		
		customer(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "(" + this.x + ", " + this.y + ")";
		}
		
	}
	
	static customer[] cus;
	static customer[] input;
	static int[] arr;
	static int N;
	static int homex;
	static int homey;
	static int comx;
	static int comy;
	static boolean[] isSelected;
	static int ans;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int test = 1; test <= T; test++) {
			N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			
			cus = new customer[N];
			isSelected = new boolean[N];
			input = new customer[N];
			
			homex = Integer.parseInt(st.nextToken());
			homey = Integer.parseInt(st.nextToken());
			comx = Integer.parseInt(st.nextToken());
			comy = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < N; i++) {
				
				int row = Integer.parseInt(st.nextToken());
				int col = Integer.parseInt(st.nextToken());
				
				cus[i] = new customer(row, col);
			}
			ans = Integer.MAX_VALUE;
			go(0);
			
			sb.append("#"+test+ " " + ans + "\n");
			
		}
		
		System.out.println(sb);
		
		
	} // main
	
	
	static void go(int cnt) {
		
		if(cnt == N) {
			
			int tmp = 0;
			tmp = Math.abs(comx - input[0].x) + Math.abs(comy - input[0].y);
			
			
			for(int i = 0; i < N - 1; i++) {
				tmp += Math.abs(input[i].x - input[i+1].x) + Math.abs(input[i].y - input[i+1].y);
				
			}
			
			tmp += Math.abs(homex - input[N-1].x) + Math.abs(homey - input[N-1].y);
			
			//System.out.println(tmp);
			ans = Math.min(ans, tmp);
			
			
//			for(int i = 0; i < N; i++) {
//				System.out.print(cus[i].x + " " + cus[i].y + " ");
//			}
//			System.out.println();
			
			return;
		}
		
		
		
		for(int i = 0; i < N; i++) {
			
			if(isSelected[i]) continue;
			
			isSelected[i] = true;
			input[cnt] = cus[i];
			go(cnt+1);
			isSelected[i] = false;
			
		}
		
		
	} //go
	
	
}