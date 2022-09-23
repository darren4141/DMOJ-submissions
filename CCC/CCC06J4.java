//https://dmoj.ca/submission/4697067

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Integer> adj[] = new ArrayList[8];
    static LinkedList<Integer> order = new LinkedList<>();
    static boolean [] added = new boolean[8];
    
    public static void main(String[] args) throws IOException {
    	for(int i = 1; i < 8; i++) adj[i] = new ArrayList<>();
    	
    	adj[7].add(1); adj[4].add(1); adj[1].add(2); adj[4].add(3); adj[5].add(3);
    	
    	while(true) {
    		int x = readInt(), y = readInt();
    		if(x == 0 && y == 0) break;
    		adj[y].add(x);
    	}
    	
    	boolean op = true;
    	while(op) {
    		op = false;
    		for(int i = 1; i < 8; i++) {
    			if(adj[i].isEmpty() && !added[i]) {
    				order.add(i);
    				op = true;
    				for(int j = 1; j < 8; j++) {
    					for(int k = 0; k < adj[j].size(); k++) {
    						if(adj[j].get(k) == i) {
    							adj[j].remove(k);
    						}
    					}
    				}
    				added[i] = true;
    				break;
    			}
    			
    			if(order.size() == 7) {
    				op = false;
    			}
    		}
    	}
    	if(order.size() != 7) {
    		System.out.println("Cannot complete these tasks. Going to bed.");
    	}else {
    		for(int v : order) System.out.print(v + " ");
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
