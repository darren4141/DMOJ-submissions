//UNFINISHED

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static ArrayList<Integer>c = new ArrayList<Integer>();
    static int frequent = -1;
    static int countfr = 0;
    public static void main(String[]args) throws IOException{

    	n = readInt();
    	
        for(int i = 0; i < n; i++){
        	c.add(readInt());
        }
        
        Collections.sort(c);
                
        for(int i = 0; i < n; i++) {
        	int k = 0;
        	int co = 0;
        	while(i > k && c.get(i) == c.get(i-k)) {
        		co++;
        		k++;
        	}
        	
        	if(co > countfr) {
        		countfr = co;
        		frequent = c.get(i);
        	}
        	
        }
        
        System.out.println(frequent + " C:" + countfr);
        
        System.out.println(findCook());
        
        
    }

    static int findCook() {
        if(n == 2) {
        	if((c.get(0) + c.get(1)) % 2 == 0) {
        		return 2;
        	}else {
        		return 1;
        	}
        }else if(frequent == -1) {
        	return 2;
        }else if(countfr == n) {
        	return n;
    	}else if(countfr == n-1) {
    		return countfr;
    	}else {
        	for(int i = 1; i < frequent; i++) {
        		System.out.println(frequent+i);
        		System.out.println(frequent-i);
        		if(c.contains(frequent+i) && c.contains(frequent-i)) {
        			return countfr + 2;
        		}
        	}
        	return countfr + 1;
        }
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException{
        return Integer.parseInt(next());
    }
}
