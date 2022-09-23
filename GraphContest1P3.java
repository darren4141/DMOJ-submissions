import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int MM = (int)11;
    
    static int n;
    static int graph [][] = new int [MM][MM];
    static int visited [] = new int [MM];
    static int cycles = 0;
    
    static void dfs(int g, int root) {
    	visited[g] = 1;
    	for(int v = 0; v < n; v++) {
    		if(graph[g][v] == 1) {
        		if(visited[v] == 0) {
        			dfs(v, root);
        		}else if(visited[v] == 1 && v == root)cycles++;        		
    		}
    	}
    	visited[g] = 0;
    }
    
    public static void main(String[] args) throws IOException {  	
    	n = readInt();    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			graph[i][j] = readInt();
    		}
    	}
    	
    	for(int i = 0; i < n; i++) {
            dfs(i, i);
            visited[i] = 2;
    	}
        System.out.println(cycles);
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
