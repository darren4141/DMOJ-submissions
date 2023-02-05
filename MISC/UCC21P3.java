//https://dmoj.ca/submission/4651672

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UCC21P3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;     
    
    public static void main(String[] args) throws IOException {  	    	
    	
    	int n = readInt();
    	int x = readInt(), y = readInt();
    	int R = readInt();
    	
    	long [] diff = new long [n+2];
    	
    	for(int i = 0; i < R; i++){
    		int l = readInt();
    		int r = readInt();
    		
    		diff[l]++;
    		diff[r+1]--;
    	}
    	
    	long [] prefix = new long [n+1];
    	for(int p = 1; p < n; p++) {
    		prefix[p] = prefix[p-1] + diff[p];
   		}	
    	
    	long total = 0;
    	for(int i = x; i <= y; i++) {
    		total += prefix[i];
    	}

    	System.out.println(total);
    	
    }
    
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
 
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
 
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
 
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
 
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
 
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
    
}
