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
    static ArrayList <Integer> graph [] = new ArrayList[MM];
    static boolean visited [] = new boolean [MM];
    static boolean cycle = false;
    
    static void dfs(int g, int root) {
    	visited[g] = true;
    	for(int v : graph[g]) {
    		if(!visited[v]) {
    			dfs(v, root);
    		}else if(visited[v] && v == root){
    			cycle = true;
    		}
    	}
    }
    
    public static void main(String[] args) throws IOException {  	
    	
    	int n = readInt();
    	int [] cols = new int [n];
    	
    	for(int i = 0; i < n; i++) {
    		graph[i] = new ArrayList<>();
    	}
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			cols[j] = readInt();
    			if(cols[j] == 1)graph[i].add(j);
    		}
    	}
    	
    	for(int i = 0; i < n; i++) {
            dfs(i, i);

    	}
        if(cycle) {
        	System.out.println("NO");
        }else {
        	System.out.println("YES");
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
