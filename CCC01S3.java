//https://dmoj.ca/submission/4668959
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Map<String, LinkedList<String>> adj = new HashMap<String, LinkedList<String>>();
    static LinkedList<String> roads = new LinkedList<String>();
    static HashMap<String, Boolean> vis = new HashMap<String, Boolean>();
    
    static void dfs(String g) {
    	vis.put(g, true);
    	for(String v : adj.get(g)) {
    		if(!vis.get(v)) {
    			dfs(v);
    		}
    	}
    }
    
    public static void main(String[] args) throws IOException {
    	adj.putIfAbsent("A", new LinkedList<String>());
    	adj.putIfAbsent("B", new LinkedList<String>());
    	adj.putIfAbsent("C", new LinkedList<String>());
    	adj.putIfAbsent("D", new LinkedList<String>());
    	adj.putIfAbsent("E", new LinkedList<String>());
    	adj.putIfAbsent("F", new LinkedList<String>());
    	adj.putIfAbsent("G", new LinkedList<String>());
    	adj.putIfAbsent("H", new LinkedList<String>());
    	adj.putIfAbsent("I", new LinkedList<String>());
    	adj.putIfAbsent("J", new LinkedList<String>());
    	adj.putIfAbsent("K", new LinkedList<String>());
    	adj.putIfAbsent("L", new LinkedList<String>());    	
    	adj.putIfAbsent("M", new LinkedList<String>());
    	adj.putIfAbsent("N", new LinkedList<String>());
    	adj.putIfAbsent("O", new LinkedList<String>());
    	adj.putIfAbsent("P", new LinkedList<String>());
    	adj.putIfAbsent("Q", new LinkedList<String>());
    	adj.putIfAbsent("R", new LinkedList<String>());
    	adj.putIfAbsent("S", new LinkedList<String>());
    	adj.putIfAbsent("T", new LinkedList<String>());
    	adj.putIfAbsent("U", new LinkedList<String>());
    	adj.putIfAbsent("V", new LinkedList<String>());
    	adj.putIfAbsent("W", new LinkedList<String>());
    	adj.putIfAbsent("X", new LinkedList<String>());
    	adj.putIfAbsent("Y", new LinkedList<String>());
    	adj.putIfAbsent("Z", new LinkedList<String>());
    	
    	String in = "";
    	while(!in.equals("**")) { 
    		in = readLine();
    		String A = in.substring(0, 1);
    		String B = in.substring(1, 2);
    		if(!in.equals("**")) {
    			adj.get(A).add(B); adj.get(B).add(A);roads.add(in);
    		}
    	}
    	
    	LinkedList<String> discon = new LinkedList<String>();
    	for(String i : roads) {
    		String A = i.substring(0, 1);
    		String B = i.substring(1, 2);	
    		adj.get(A).remove(B); adj.get(B).remove(A);
        	vis.put("A", false);
        	vis.put("B", false);
        	vis.put("C", false);
        	vis.put("D", false);
        	vis.put("E", false);
        	vis.put("F", false);
        	vis.put("G", false);
        	vis.put("H", false);
        	vis.put("I", false);
        	vis.put("J", false);
        	vis.put("K", false);
        	vis.put("L", false);
        	vis.put("M", false);
        	vis.put("N", false);
        	vis.put("O", false);
        	vis.put("P", false);
        	vis.put("Q", false);
        	vis.put("R", false);
        	vis.put("S", false);
        	vis.put("T", false);
        	vis.put("U", false);
        	vis.put("V", false);
        	vis.put("W", false);
        	vis.put("X", false);
        	vis.put("Y", false);
        	vis.put("Z", false);
    		dfs("A");
    		adj.get(A).add(B); adj.get(B).add(A);
    		if(!vis.get("B")) {
    			discon.add(i);
    		}
    	}
    	for(String i : discon) System.out.println(i);
    	System.out.println("There are " + discon.size() + " disconnecting roads.");
    }
    
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
