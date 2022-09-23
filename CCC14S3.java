//https://dmoj.ca/submission/4693036

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
    	int t = readInt();
    	for(int iter = 0; iter < t; iter++) {
    		Stack<Integer> stk = new Stack<Integer>();
    		Stack<Integer> branch = new Stack<Integer>();
    		Stack<Integer> end = new Stack<Integer>();

    		int n = readInt();
    		for(int i = 0; i < n; i++) {
    			stk.push(readInt());
    		}
    		
    		int i = 1;
    		for(int a = 0; a < n*2; a++) {
    			int CANT = 0;
    			if(!stk.isEmpty()) {
    				if(stk.peek() == i) {
    					end.push(stk.pop()); i++;
    					continue;
    				}else {
    					CANT++;
    				}
    			}
    			if(!branch.isEmpty()) {
    				if(branch.peek() == i) {
    					end.push(branch.pop()); i++; continue; 
    				}else {
    					CANT++;
    				}
    			}
    			if(!stk.isEmpty()) {
    				if(stk.peek() != i) {
    					branch.push(stk.pop()); continue;
    				}
    			}
    			
    			if(CANT == 2) {
    				break;
    			}
    		}
    		System.out.println((end.peek() == n)? "Y":"N");
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
