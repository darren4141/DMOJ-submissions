import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int MM = 50;
    static ArrayList<Integer> adj[] = new ArrayList[MM];
    static boolean vis[] = new boolean [MM];
	static Set<Integer> fof = new HashSet<Integer>();

    
    static void operationI(int x, int y) {
    	if(!adj[x].contains(y)) adj[x].add(y);adj[y].add(x);
    }
    
    static void operationD(int x, int y) {
    	for(int i = 0; i < adj[x].size(); i++) if(adj[x].get(i) == y)adj[x].remove(i);
    	for(int i = 0; i < adj[y].size(); i++) if(adj[y].get(i) == x)adj[y].remove(i);
    }
    
    static void operationN(int x) {
    	int friends = 0;
    	for(int v : adj[x]) {
    		friends++;
    	}
    	System.out.println(friends);
     }
    
    static void operationF(int x) {
    	fof.clear();
    	int friendoffriend = 0;
    	for(int v : adj[x]) {
    		operationFoF(v, x);
    	}
    	System.out.println(fof.size());
    }
    
    static void operationFoF(int x, int origx) {
    	int friends = 0;
    	for(int v : adj[x]) {
    		boolean canadd = true;
    		for(int h : adj[origx]) {
    			if(v == h) {
    				canadd = false;
    			}
    		}
    		if(v == origx)canadd = false;
    		if(canadd)fof.add(v);
    	}
     }
    
    static void operationS(int x, int y) {
    	Queue <Integer> q = new LinkedList<>();
    	for(int i = 0; i < vis.length; i++) vis[i] = false;
    	
        int dis [] = new int[MM];
        q.add(x);
        vis[x] = true;
        dis[x] = 1;
        int shortest = 1000000000;
        while(!q.isEmpty()) {
        	int c = q.poll();
        	for(int v : adj[c]) {
        		if(v == y && dis[c] < shortest)shortest = dis[c];
        		if(!vis[v]) {
        			q.add(v);
        			dis[v] = dis[c] + 1;
        			vis[v] = true;
        		}
        	}
        }
        if(shortest == 1000000000) {
            System.out.println("Not connected");
        }else System.out.println(shortest);
    }
    
    public static void main(String[] args) throws IOException {
    	for(int i = 0; i < 50; i++) {
    		adj[i] = new ArrayList<>();
    	}
    	
    	adj[1].add(6);
    	adj[2].add(6);
    	adj[3].add(4);adj[3].add(5);adj[3].add(6);adj[3].add(15);
    	adj[4].add(3);adj[4].add(5);adj[4].add(6);
    	adj[5].add(3);adj[5].add(3);adj[5].add(4);adj[5].add(6);
    	adj[6].add(1);adj[6].add(2);adj[6].add(3);adj[6].add(4);adj[6].add(5);adj[6].add(7);
    	adj[7].add(6);adj[7].add(8);
    	adj[8].add(7);adj[8].add(9);
    	adj[9].add(8);adj[9].add(10);adj[9].add(12);
    	adj[10].add(9);adj[10].add(11);
    	adj[11].add(10);adj[11].add(12);
    	adj[12].add(9);adj[12].add(11);adj[12].add(13);
        adj[13].add(12);adj[13].add(14);adj[13].add(15);
        adj[14].add(13);
        adj[15].add(3);adj[15].add(13);
        adj[16].add(17);adj[16].add(18);
        adj[17].add(16);adj[17].add(18);
        adj[18].add(16);adj[18].add(17);
        
        String command = "";
        while(!command.equals("q")) {
        	command = readLine();
        	
        	if(command.equals("i")) {
        		int x = readInt();
        		int y = readInt();
        		operationI(x, y);
        	}else if(command.equals("d")) {
        		int x = readInt();
        		int y = readInt();
        		operationD(x, y);
        	}else if(command.equals("n")) {
        		int x = readInt();
        		operationN(x);
        	}else if(command.equals("f")) {
        		int x = readInt();
        		operationF(x);
        	}else if(command.equals("s")) {
        		int x = readInt();
        		int y = readInt();
        		operationS(x, y);
        	}
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
