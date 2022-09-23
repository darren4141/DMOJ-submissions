//https://dmoj.ca/submission/4660968
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int MM = (int)2e3+5;
    
    static ArrayList <Integer> graph [] = new ArrayList[MM];
    static boolean visited [] = new boolean [MM];
    static boolean variablenamesaregettingwaytoolongopenbracketunironicclosedbracket [] = new boolean [MM];
    static int cycles = 0;
    
    static void dfs(int g, int root) {
    	visited[g] = true;
    	for(int v : graph[g]) {
        	if(!visited[v]) {
        		dfs(v, root);
        	}else if(visited[v] && v == root) {
        		if(!variablenamesaregettingwaytoolongopenbracketunironicclosedbracket[v])cycles++;        		
        		variablenamesaregettingwaytoolongopenbracketunironicclosedbracket[v] = true;
        	}
    	}
    	visited[g] = false;
    }
    
    public static void main(String[] args) throws IOException {  	
    	int n = readInt(), k = readInt();    
    	
    	for(int i = 0; i <= n; i++) {
    		graph[i] = new ArrayList<>();
    	}
    	
    	for(int i = 0; i < k; i++) {
    		int a = readInt(), b = readInt(), sa = readInt(), sb = readInt();
    		if(sa>sb) graph[a].add(b);
    		if(sa<sb) graph[b].add(a);
    	}
    	
    	for(int i = 0; i <= n; i++) {
            dfs(i, i);
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
