//https://dmoj.ca/submission/4700522

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
	static String[] letters = {"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	static int w; 
	static int count = 0;

    public static void main(String[] args) throws IOException {
    	w = readInt();
    	
    	for(int i = 1; i < letters.length; i++) {
    		System.out.print(letters[i] + " ");
    		count++;
    		if(count >= w) break;
    	}
    	
    	for(int i = 0; i < letters.length; i++) {
    		for(int j = 1; j < letters.length; j++) {
	    		words(letters[i]+letters[j]);
    		}
    	}
    }
    
    static void words(String prefix) {
		if(count > w) {
			return;
		}
		if(count <= w) {
	    	for(int i = 1; i < letters.length; i++) {
	    		count++;
	    		if(count > w) {
	    			return;
	    		}
	    		System.out.print(prefix + letters[i] + " ");
	    	}
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
