//https://dmoj.ca/submission/4654954

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int MM = (int)2e3+5;
    
	static ArrayList<Integer> house [] = new ArrayList[MM];
	static boolean visited [] = new boolean[MM];
	
	static void dfs (int g) {
		visited[g] = true;
		for(int v : house[g]) {//iterate through all of house g's roads
			if(!visited[v]) {
				dfs(v);
			}
		}
	}
    
    
    public static void main(String[] args) throws IOException {  	    	
    	int n = readInt(), m = readInt(), a = readInt(), b = readInt();
    	
    	for(int i = 0; i <= n; i++) {
    		house[i] = new ArrayList<>();
    	}
    	
    	
    	for(int i = 0; i < m; i++) {
    		int x = readInt(), y = readInt();
    		house[x].add(y); house[y].add(x);
    	}
    	
    	dfs(a);
    	if(visited[b]) {
    		System.out.println("GO SHAHIR!");
    	}else {
    		System.out.println("NO SHAHIR!");
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
