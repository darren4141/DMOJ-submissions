//https://dmoj.ca/submission/4634479
import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int m = Integer.parseInt(br.readLine());//rows
    	int n = Integer.parseInt(br.readLine());//columns
    	int k = Integer.parseInt(br.readLine());

    	int count = 0;
    	int[] r = new int[m];
    	int[] c = new int[n];
    	String [] s = new String[k];
    	
    	for(int i = 0; i < k; i++) {
    		char rc = (char) br.read();
    		String a = br.readLine();
    		a = a.replace(" ", "");
    		int num = Integer.parseInt(a);
    		if(rc == 'R') {
    			r[num-1]++;
    		}else {
    			c[num-1]++;
    		}

    		
    		
    	}
    	int goldRows = 0;
    	int goldColumns = 0;
    	
    	for(int i = 0; i < m; i++) {    		
        	if(r[i]%2==1) goldRows++;

    	}
    	count += goldRows*n;
    	
    	for(int i = 0; i < n; i++) {    		
        	if(c[i]%2==1) goldColumns++;

    	}
    	count += goldColumns*((m-goldRows) - goldRows);
    	
    	System.out.println(count);
    }

	private static int parseInt(String readLine) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
