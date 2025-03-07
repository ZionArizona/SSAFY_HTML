package graph3_0307;
import java.util.*;
import java.io.*;


public class Permutation {

	static int N;
	static int R;
	static boolean[] isSelected;
	static int[] arr; // N개를 저장하기 위한 배열
	static int[] num; // 순열 출력을 위해 저장할 배열
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		// N 개중 R 개를 선택해 나열 하는 순열
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1];
		isSelected = new boolean[N+1];
		num = new int[R];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 순열
		Permutation(0);
		
		//중복 순열
		//Permutation2(0);
		
	}
	
	
	private static void Permutation(int depth) {
		
		if(depth == R) {
			
			System.out.println(Arrays.toString(num));
			
			return;
		}
		
		
		
		for(int i = 1; i <= N; i++) {
			if(isSelected[i]) continue;
			
			
			isSelected[i] = true;
			num[depth] = arr[i];
			Permutation(depth+1);
			isSelected[i] = false;
			
		}
		
	}
	
	private static void Permutation2(int depth) {
		
		if(depth == R) {
			
			System.out.println(Arrays.toString(num));
			
			return;
		}
		
		
		
		for(int i = 1; i <= N; i++) {
			
			num[depth] = arr[i];
			Permutation2(depth+1);
			
		}
		
	}
	
	
}