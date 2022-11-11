//https://dmoj.ca/submission/4691205
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC09J4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
    	int n = readInt(), remainingwords = 0;
    	int [] size = {7, 2, 3, 4, 4, 5};
    	String [] words = {"WELCOME", "TO", "CCC", "GOOD", "LUCK", "TODAY"};

    	while(remainingwords<6) {
    		ArrayList <String> pool = new ArrayList<>();
    		ArrayList <Integer> sizes = new ArrayList<>();

    		for(int i = remainingwords; i < 6; i++) {
    			pool.add(words[i]);
    		}
    		
    		sizes.add(size[remainingwords]);
    		for(int i = remainingwords + 1; i < 6; i++) {
    			sizes.add((size[i] + sizes.get(i-remainingwords-1))+1);
    		}
    		
        	int endl = 0, LINESPACE = 0;
	    	for(int i = sizes.size()-1; i >= 0; i--) {
	    		if(n >= sizes.get(i)) {
	    			endl = i;
	    			break;
	    		}
	    	}
	    		    	    	
	    	int dots = 0;
	    	int extra = 0;
	    	
	    	if(endl != 0) {
	        	dots = (n - sizes.get(endl))/endl;
	        	extra = (n - sizes.get(endl))%endl;
	    	}
	    	
	    	for(int i = 0; i <= endl; i++) {
		   		System.out.print(pool.get(i));
		   		LINESPACE += pool.get(i).length();
		    	remainingwords++;
	    		if(i != endl) {
	        		for(int j = 0; j <= dots; j++) {
	        			LINESPACE++;
	            		System.out.print(".");
	        		}
	    		}
	
	    		if(i < extra) {
	        		System.out.print(".");
	        		LINESPACE++;
	    		}
	    	}
	    		    		    	
	    	if(LINESPACE < n) {
	    		for(int i = 0; i < n-LINESPACE; i++) System.out.print(".");
	    	}
	    	System.out.println();
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
