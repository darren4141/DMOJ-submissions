//https://dmoj.ca/submission/4673206
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
    	int t = readInt();
    	int fins [] = new int [t];
    	
    	for(int weewoooweewoooweewoowee = 0; weewoooweewoooweewoowee < t; weewoooweewoooweewoowee++) {    		
    		int r = readInt(), c = readInt();
    		String [][] city = new String[r+1][c+1];

    		for(int i = 0; i < r; i++) {
    			String line = readLine();
    			for(int j = 0; j < c; j++) {
    				city[i][j] = Character.toString(line.charAt(j));
    			}
    		} 
    		
    		if(city[r-1][c-1].equals("*")) {
    			fins[weewoooweewoooweewoowee] = -1;
    			continue;
    		}
    		
    	    ArrayList<Integer> adj[] = new ArrayList[(r+2)*(c+2)];
        	for(int i = 0; i < (r+2)*(c+2); i++) adj[i] = new ArrayList<>();
        	

            for(int i = 0; i < r; i++) {
           		for(int j = 0; j < c; j++) {
           			if(city[i][j].equals("+")) {
           				if(((i+1)*c + j) < r*c) adj[(i*c) + j].add(((i+1)*c) + j);     
           				if(((i-1)*c + j) >= 0) adj[(i*c) + j].add(((i-1)*c) + j); 
           				if(c != 1) {
           					if((j+1)%c != 0) adj[(i*c) + j].add((i*c) + j+1);     
           					if((j+1)%c != 1) adj[(i*c) + j].add((i*c) + j-1);   
           				}
  
           			}else if (city[i][j].equals("-")) {
           				if(c != 1) {
           					if((j+1)%c != 0) adj[(i*c) + j].add((i*c) + j+1);     
           					if((j+1)%c != 1) adj[(i*c) + j].add((i*c) + j-1);   
           				}  
           			}else if(city[i][j].equals("|")) {
           				if(((i+1)*c + j) < r*c) adj[(i*c) + j].add(((i+1)*c) + j);     
           				if(((i-1)*c + j) >= 0) adj[(i*c) + j].add(((i-1)*c) + j);     
            		}
            	}
           	}
        	
        	Queue <Integer> q = new LinkedList<>();
        	boolean vis [] = new boolean [(r*c)+1];
        	int dis [] = new int [(r*c)+1];
        	q.add(0);
        	vis[0] = true;
        	dis[0] = 1;
        	
        	while(!q.isEmpty()) {
        		int cur = q.poll();
        		for(int v : adj[cur]) {
        			if(!vis[v]) {
        				q.add(v);
        				dis[v] = dis[cur] + 1;
        				vis[v] = true;
        			}
        		}
        	}

        	int CanadianComputingCompetitionCOLON2008Stage1COMMASeniorNUMBER3 = (r*c) - 1;
        	if(!vis[CanadianComputingCompetitionCOLON2008Stage1COMMASeniorNUMBER3]) {
        		fins[weewoooweewoooweewoowee] = -1;
        	}else {
        		fins[weewoooweewoooweewoowee] = dis[CanadianComputingCompetitionCOLON2008Stage1COMMASeniorNUMBER3];
        	}
    	}
    	
    	for(int httpsCOLONSLASHSLASHdmojDOTcaSLASHproblemSLASHccc08s3 : fins) System.out.println(httpsCOLONSLASHSLASHdmojDOTcaSLASHproblemSLASHccc08s3);
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
