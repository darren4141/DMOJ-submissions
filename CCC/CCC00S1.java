//https://dmoj.ca/submission/4669907

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC00S1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {    
    int q = Integer.parseInt(br.readLine()), one = Integer.parseInt(br.readLine()), two = Integer.parseInt(br.readLine()), three = Integer.parseInt(br.readLine()), plays = 0;
    while(q != 0) {
    	plays++;
    	if((plays+2) % 3 == 0) {
    		q--; one++;
    		if(one%35 == 0) q+=30;
    	}else if((plays+1) % 3 == 0) {
    		q--; two++;
    		if(two%100 == 0) q+=60;
    	}else {
    		q--; three++;
    		if(three%10 == 0) q+=9;
    	}
    }
    System.out.println("Martha plays " + plays + " times before going broke.");
    }
}
