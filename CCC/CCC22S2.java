//DOES NOT WORK

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC22S2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
    	int v = 0;
    	int x = readInt();
    	String [] samA = new String[x]; 
    	String [] samB = new String[x]; 
    	for(int i = 0; i < x; i++) {
    		String [] same = readLine().split(" ");
    		samA[i] = same[0];
    		samB[i] = same[1];
    	}
    	
    	int y = readInt();
    	String [] sepA = new String[y]; 
    	String [] sepB = new String[y];     	
    	for(int i = 0; i < y; i++) {
    		String [] sepe = readLine().split(" ");
    		sepA[i] = sepe[0];
    		sepB[i] = sepe[1];
    	}
    	
    	int g = readInt();
    	String [] groups = new String[g];
    	
    	for(int i = 0; i < g; i++) {
    		groups[i] = readLine();

    	}

		for(int i = 0; i < x; i++) {
			for(int j = 0; j < groups.length; j++) {
				if(groups[j].contains(samA[i]) && !groups[j].contains(samB[i])) {
//					System.out.println(j);
//					System.out.println(groups[j].contains(samA[i]));
//					System.out.println(!groups[i].contains(samB[i]));
					v++;
					break;
				}
			}
		}
		
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < groups.length; j++) {
				if(groups[j].contains(sepA[i]) && groups[j].contains(sepB[i])) {
					v++;
					break;
				}
			}
		}

    	System.out.println(v);
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
}//hey you! yes you! stop stalking my DMOJ submissions you creep >:(