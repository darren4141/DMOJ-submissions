import java.io.*;
import java.util.StringTokenizer;

public class Q2pt2 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[]args) throws IOException {
		int n = readInt();
		int [] h = new int[n];
		int [] low = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = readInt();
			low[i] = Integer.MAX_VALUE;
		}
		
		low[0] = 0;
		
		if(n % 2 == 0) {
			low[n-1] = 0;
			for(int i = 0; i < n/2; i++) {
				low[n-1] += Math.abs(h[i] - h[n-i-1]);
			}
		}
		
		for(int i = 1; i < n; i+=2) {
			low[i] = 0;
			for(int j = 0; j < (i/2)+1; j++) {
				low[i] += Math.abs(h[j] - h[i-j-1]);
			}
		}
		
		low[1] = Math.abs(h[0] - h[1]);

		
		for(int i = 0; i < n; i++) {
//			System.out.println("---------------MIDPOINT OF " + i);
			int maxCrop = Math.min(i, n-(i+1));
//			System.out.println("MAX CROP " + maxCrop);
			int oddCrop = 0;
			int evenCrop = 0;
			for(int c = 0; c <= maxCrop; c++) {
				oddCrop += Math.abs(h[i-c] - h[i+c]);
//				System.out.println(c + " out either side: " + oddCrop);
//				System.out.println(h[i-c] + ", " + h[i+c]);
//				System.out.println("Size of " + ((2*c)+1));

				if(oddCrop < low[(2*c)]) {
					low[(2*c)+1] = oddCrop;
				}
			}
			
			for(int c = 0; c < maxCrop; c++) {
				evenCrop += Math.abs(h[i-c] - h[i+c+1]);
//				System.out.println(c + " out either side: " + evenCrop);
//				System.out.println(h[i-c-1] + ", " + h[i+c]);
//				System.out.println("Size of " + ((2*c)+2));

				if(evenCrop < low[(2*c)+1]) {
					low[(2*c)] = evenCrop;
				}
				
			}
			
			for(int c = 0; c < n; c++) {
				
			}
			
		}
		
		for(int i = 0; i < low.length; i++) {
			System.out.print(low[i]);
			if(i != low.length-1) {
				System.out.print(" ");
			}
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