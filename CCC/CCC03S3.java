//https://dmoj.ca/submission/4671181
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int MM = 1000;
    static boolean room [][] = new boolean[30][30];
    static ArrayList<Integer> adj[] = new ArrayList[MM];
	static boolean vis [] = new boolean[MM];
	static int tiles = 0;

    static void dfs(int g) {
    	vis[g] = true;
    	tiles++;
    	for(int v : adj[g]) {
    		if(!vis[v]) {
    			dfs(v);
    		}
    	}
    }
    
    public static void main(String[] args) throws IOException {
    	int floors = 0;
    	int paint = readInt(), r = readInt(), c = readInt();
    	for(int i = 0; i <= (r+2)*(c+2); i++)adj[i] = new ArrayList<>();
    	
    	for(int i = 1; i <= r; i++) {
    		String row = readLine();
    		for(int j = 1; j <= c; j++) {
    			if(row.charAt(j-1) == '.') {
    				room[i][j] = true;
    				floors++;
    			}else {
    				room[i][j] = false;
    			}
    		}
    	}
    	
    	for(int i = 1; i <= r; i++) {
    		for(int j = 1; j <= c; j++) {
    			if(room[i][j] && room[i+1][j])adj[(i*c) + j].add(((i+1)*c) + j);
    			if(room[i][j] && room[i-1][j])adj[(i*c) + j].add(((i-1)*c) + j);
    			if(room[i][j] && room[i][j+1])adj[(i*c) + j].add((i*c) + j+1);
    			if(room[i][j] && room[i][j-1])adj[(i*c) + j].add((i*c) + j-1);
    		}
    	}
    	
        LinkedList<Integer> sizes = new LinkedList<Integer>();
    	for(int i = 1; i < (r+2)*(c+2); i++) {
    		if(vis[i] != true) {
    			dfs(i);
    			if(tiles != 1) sizes.add(tiles);
    		}
    		tiles = 0;
    	}
    	
    	for(int i : sizes) floors -= i;
    	for(int i = 0; i < floors; i++) {
    		sizes.add(1);
    	}
    	
    	int fin [] = new int[sizes.size()];
    	int o = 0;
    	for(int i : sizes) {
    		fin[o] = i;
    		o++;
    	}
    	
    	Arrays.sort(fin);
    	int paintedrms = 0;
    	for(int i = fin.length-1; i >= 0; i--) {
    		if(paint >= fin[i]) {
    			paintedrms++;
        		paint -= fin[i];
    		}else {
    			break;
    		}
    	}
    	
    	if(paintedrms == 1) {
        	System.out.println(paintedrms + " room, " + paint + " square metre(s) left over");
    	}else {
        	System.out.println(paintedrms + " rooms, " + paint + " square metre(s) left over");

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
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
