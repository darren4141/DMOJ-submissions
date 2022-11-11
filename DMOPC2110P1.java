//https://dmoj.ca/submission/4657817

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DMOPC2110P1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    
    public static void main(String[] args) throws IOException {  	
    	
    	int n = readInt();
    	String [] ans = new String [n];
    	
    	for(int i = 0; i < n; i++) {
    		String word = readLine();
    		
    		String [] letters = {"ka", "ki", "ku", "ke", "ko", "na", "ni", "nu", "ne", "no", "ha", "hi", "fu", "he", "ho", "ma", "mi", "mu", "me", "mo", "ra", "ri", "ru", "re", "ro", "a", "i", "u", "e", "o"};
    		
    		for(int j = 0; j < 30; j++) {
    			if(word.contains(letters[j])) {
    				word = word.replace(letters[j], " ");	
    			}
    		}
    		
    		word = word.replace(" ", "");

    		if(word.equals("")) {
    			ans[i] = "YES";
    		}else {
    			ans[i] = "NO";

    		}
    		
    	}
    	
    	for(int i = 0; i < n; i++) {
    		System.out.println(ans[i]);
    	}
    	
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
