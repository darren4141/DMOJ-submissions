//https://dmoj.ca/submission/4662556
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int MM = 1000001;
    static ArrayList <Integer> ppl[] = new ArrayList[MM];
    static boolean visited [] = new boolean[MM];
    static boolean uvisited [] = new boolean[MM];
    static int taller = 0;
    
    static void dfs(int p, int q) {
    	visited[p] = true;
    	for(int v : ppl[p]) {
    		if(v == q) {
    			taller = 1;
    		}else if(!visited[v]) {
    			dfs(v, q);
    		}
    	}
    }
    
    static void udfs(int p, int q) {
    	visited[q] = true;
    	for(int v : ppl[q]) {
    		if(v == p) {
    			taller = 2;
    		}else if(!visited[v]) {
    			udfs(p, v);
    		}
    	}
    }
    
    public static void main(String[] args) throws IOException {  
        
    	int n = readInt(), m = readInt();
    	
    	for(int i = 0; i <= n; i++) {
    		ppl[i] = new ArrayList<>();
    	}
    	
    	for(int i = 0; i < m; i++) {
    		int p = readInt(), q = readInt();
    		ppl[p].add(q);
    	}
    	    	
    	int sp = readInt(), sq = readInt();
    	dfs(sp, sq);
    	if(taller != 1) udfs(sp, sq);
    	
    	if(taller == 1) {
    		System.out.print("yes\n");
    	}else if(taller == 2){
    		System.out.print("no\n");
    	}else {
    		System.out.print("unknown\n");
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
