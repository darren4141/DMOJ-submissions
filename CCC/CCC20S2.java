//DOES NOT WORK


import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CCC20S2 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final int MM = (int) 10e4; 
	static ArrayList<Integer> adj[] = new ArrayList[MM];
	static boolean visited[] = new boolean[MM];
	
	static void dfs (int g) {
		visited[g] = true;
		for(int v : adj[g]) {//iterate through all of house g's roads
			if(!visited[v]) {
				dfs(v);
			}
		}
	}
	
	public static void main(String[]args) throws IOException{
    	for(int i = 0; i < 50; i++) {
    		adj[i] = new ArrayList<>();
    	}
		int len = readInt();
		int wid = readInt();
		int nums[] = new int [(len*wid)+100];
		for(int i = 1; i <= len*wid; i++) {
			nums[i] = readInt();		
		}
		
		//iterate through all the elements, iterate from 1 to the element itself, if it is divisible and within the range, add it to the graph
		for(int i = 1; i <= len*wid; i++) {
			for(int j = 1; j <= nums[i]; j++) {
				if(nums[i] % j == 0) {
//					System.out.println("Check for: " + nums[i] + " divided by: " + j);
					
//					System.out.print("upright| " + j + ", " + nums[i]/j);
					if(j <= len && nums[i]/j <= wid) {
//						System.out.println(" is valid, adding " + nums[(j-1)*wid + nums[i]/j]);
						adj[i].add(nums[(j-1)*wid + nums[i]/j]);
					}else {
//						System.out.println();
					}
					
//					System.out.print("flipped| " + nums[i]/j + ", " + j);
//					if(j <= wid && nums[i]/j <= len) {
//						System.out.println(" is valid, adding " + nums[((nums[i]/j)-1)*wid + j]);
//						adj[i].add(nums[((nums[i]/j)-1)*wid + j]);
//					}else {
//						System.out.println();
//					}
					

				}
			}
		}
		
		dfs(1);
			
		if(visited[len*wid]) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
//		for(int i = 1; i <= len*wid; i++) {
//			System.out.print(nums[i] + ": ");
//			for(int j = 0; j < adj[i].size(); j++) {
//				System.out.print(adj[i].get(j) + " ");
//			}
//			System.out.println();
//		}
		
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
