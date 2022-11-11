//https://dmoj.ca/submission/4665212
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC18J5 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int MM = 10001;
    static ArrayList<Integer> adj[] = new ArrayList[MM];

    public static void main(String[] args) throws IOException {
    	int n = readInt();
    	for(int i = 0; i <= n; i++)adj[i] = new ArrayList<>();
    	
    	for(int i = 1; i <= n; i++) {
    		int m = readInt();
    		if(m == 0) {
    			adj[i].add(0);
    		}
        	for(int j = 1; j <= m; j++) {
    			adj[i].add(readInt());
    		}
    		
    	}
        
    	Queue <Integer> q = new LinkedList<>();
    	boolean visited [] = new boolean[n+1];
        int dis [] = new int[n+1];
        q.add(1); 
        visited[1] = true; 
        dis[1] = 1;
        int shortest = 1001;
        
        while(!q.isEmpty()) {
        	int c = q.poll();
        	for(int v : adj[c]) {
        		if(v == 0 && dis[c] < shortest) {
        			shortest = dis[c];
        		}
        		if(!visited[v]) {
        			q.add(v);
        			dis[v] = dis[c] + 1;
        			visited[v] = true;
        		}
        	}
        }
        
        boolean reachable = true;
        for(int i = 1; i <= n; i++) {
        	if(!visited[i]) {
        		reachable = false;
        	}
        }

        if(reachable) {
        	System.out.println("Y");
        }else {
        	System.out.println("N");
        }
        
        System.out.println(shortest);
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
