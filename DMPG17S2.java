//https://dmoj.ca/submission/4681794

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DMPG17S2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int par [] = new int[100001];
    static boolean [] used = new boolean[100001];

    public static void main(String[] args) throws IOException {
    	int n = readInt(), q = readInt();
        for(int i = 0; i <= n; i++) par[i] = i;
        for(int i = 0; i < q; i++) {
        	String o = next(); int x = readInt(), y = readInt();
        	
        	if(o.equals("A")) {
        		merge(x, y);
        	}else if(o.equals("Q")) {
        		System.out.println((find(x) == find(y)?"Y":"N"));
        	}
        }
    }
    
    static int find(int x) {
    	if(par[x] != x) par[x] = find(par[x]);
    	return par[x];
    }
    
    static void merge(int x, int y) {
    	int xPar = find(x), yPar = find(y);
    	par[yPar] = xPar;
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
