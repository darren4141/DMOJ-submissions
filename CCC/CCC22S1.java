//https://dmoj.ca/submission/4656279

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CCC22S1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    
    public static void main(String[] args) throws IOException {  	    	
    	int n = readInt();
    	int combos = 0;
    	
    	for(int i = 0; i <= n / 4; i++) {
    		if(n-(4*i) == 0 || (n - (4*i)) % 5 == 0) {
    			combos++;
    		}
    	}
    	System.out.println(combos);
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
