package divide_conquer_0304;
import java.util.*;
import java.io.*;


public class SquareNumberTest {
	
	static int callCnt;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		callCnt = 0;
		System.out.println(exp1(X, N));
		System.out.println("O(N) : " + callCnt);
		
		
		callCnt = 0;
		System.out.println(exp2(X, N));
		System.out.println("O(logN) : " + callCnt);
		
	} // main
	
	
	
	
	
	// O(N) 방식
	private static long exp1(long x, long n) { // x^n = x*x^n-1
		++callCnt;
		
		// 기저
		if(n == 1) return x;
		
		
		return x * exp1(x, n-1);
		
	} //exp1
	
	
	
	private static long exp2(long x, long n) {
		++callCnt;
		
		//기저
		if(n == 1) return x;
	
		
		long y = exp2(x, n/2);		
		return n%2 == 0 ? y*y : y*y*x;
		
	}
	
}