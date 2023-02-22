import java.io.*;
import java.util.StringTokenizer;

public class Q2 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[]args) throws IOException {
		int n = readInt();
		int [] h = new int[n];
		int [] low = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = readInt();
		}
		
		for(int i = 2; i <= n; i++) {//crop size
			int lowest = Integer.MAX_VALUE;
//			System.out.println("CROPPING FOR " + i);
			for(int j = 0; j < (n-i+1); j++) {//iterate through different crops
				int value = 0;
				
				//+
//				System.out.print("CROP OF ");
//				for(int k = 0; k < i; k++) {
//					System.out.print(h[k+j] + " ");
//				}
//				
//				System.out.println();
//				
				//
				
				for(int k = 0; k < (i/2); k++) {//calculate crop value
//					System.out.println(h[k+j] + ", " + h[j+i-k-1]);
					value += Math.abs(h[k+j] - h[j+i-k-1]);
					if(value > lowest) {
						break;
					}
				}
				
				//+
//				System.out.println("VALUE OF " + value);
				//				
				
				if(value < lowest) {
					lowest = value;
				}
			}
			low[i-1] = lowest;
		}
		
		for(int v : low) {
			System.out.print(v + " ");
		}
		
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
