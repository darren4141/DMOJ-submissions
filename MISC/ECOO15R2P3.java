//https://dmoj.ca/submission/4646348

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ECOO15R2P3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {

    	
    	for(int i = 0; i < 10; i++) {
        	int n = readInt();
        	int t = readInt();
        	System.out.println(2 * (n-1) + 1);
    	}
  	
    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
 
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
}
