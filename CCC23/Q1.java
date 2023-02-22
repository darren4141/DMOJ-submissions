import java.io.*;
import java.util.StringTokenizer;

public class Q1 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[]args) throws IOException {
		int n = readInt();
		int c = 0;
		int cnt = 0;
		
		boolean [] one = new boolean[n];
		boolean [] two = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			int a = readInt();
			
			if(a == 1) {
				one[i] = true;
			}else {
				one[i] = false;
			}
		}
		
		for(int i = 0; i < n; i++) {
			int a = readInt();
			
			if(a == 1) {
				two[i] = true;
			}else {
				two[i] = false;
			}
		}
		
		for(int i = 0; i < n; i++) {
			
			if(one[i]) cnt++;
			if(two[i]) cnt++;
			
//			if(i < n-1 && (one[i] && one[i+1])) {
//				c++;
//			}
			
			if(i > 0 && (one[i] && one[i-1])) {
				c++;
			}
			
//			if(i < n-1 && (two[i] && two[i+1])) {
//				c++;
//			}
			
			if(i > 0 && (two[i] && two[i-1])) {
				c++;
			}
			
			if(i % 2 == 0 && (one[i] && two[i])) {
				c++;
			}
		}
		
//		System.out.println(cnt);
//		System.out.println(c);
		System.out.println((3*cnt) - (c*2));
		
	}
	
	static String next() throws IOException {
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		
		return st.nextToken();
	}
	
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
	
}
