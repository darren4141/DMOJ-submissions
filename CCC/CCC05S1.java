//https://dmoj.ca/submission/4653827

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CCC05S1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;     
    
    public static void main(String[] args) throws IOException {  	    	

    	int t = readInt();
    	String [] num = new String [t];
    	
    	for(int i = 0; i < t; i++) {
    		num[i] = readLine();
    	}
    	
    	for(int i = 0; i < t; i++) {
    		num[i] = num[i].replace("-", "");
    		num[i] = num[i].replace("A", "2");
    		num[i] = num[i].replace("B", "2");
    		num[i] = num[i].replace("C", "2");
    		num[i] = num[i].replace("D", "3");
    		num[i] = num[i].replace("E", "3");
    		num[i] = num[i].replace("F", "3");
    		num[i] = num[i].replace("G", "4");
    		num[i] = num[i].replace("H", "4");
    		num[i] = num[i].replace("I", "4");
    		num[i] = num[i].replace("J", "5");
    		num[i] = num[i].replace("K", "5");
    		num[i] = num[i].replace("L", "5");
    		num[i] = num[i].replace("M", "6");
    		num[i] = num[i].replace("N", "6");
    		num[i] = num[i].replace("O", "6");
    		num[i] = num[i].replace("P", "7");
    		num[i] = num[i].replace("Q", "7");
    		num[i] = num[i].replace("R", "7");
    		num[i] = num[i].replace("S", "7");
    		num[i] = num[i].replace("T", "8");
    		num[i] = num[i].replace("U", "8");
    		num[i] = num[i].replace("V", "8");
    		num[i] = num[i].replace("W", "9");
    		num[i] = num[i].replace("X", "9");
    		num[i] = num[i].replace("Y", "9");
    		num[i] = num[i].replace("Z", "9");
    		
    		System.out.println(num[i].substring(0, 3) + "-" + num[i].substring(3, 6) + "-" + num[i].substring(6, 10));
    	}
    	
    }
    
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
 
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
 
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
 
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
 
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
 
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
    
}
