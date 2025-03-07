package graph2;
import java.util.*;
import java.io.*;

public class Main {
	
	static int N;
	static long ans;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		ans = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int idxstart = 0;
		int idxend = N -1;
		int leftans = 0;
		int rightans = 0;
		
		while(idxstart < idxend) {
			int sum = arr[idxstart] + arr[idxend];
			//System.out.println(Math.abs(sum));
			//System.out.println(ans);
			int chk = Math.abs(sum);
			if(chk < ans) {
				ans = Math.abs(sum);
				
				
				leftans = idxstart;
				rightans = idxend;
			}
			
			if(sum > 0) {
				idxend--;
			}
			else if(sum < 0) {
				idxstart++;
			}
			
			
		}
		
		
		System.out.println(arr[leftans] + " " + arr[rightans]);
		
	}  //main
	
}