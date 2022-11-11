//https://dmoj.ca/submission/4630614
import java.io.*;
import java.util.*;

public class CCC21J4 {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String b = br.readLine();
    	
    	int swaps = 0;
    	int LN = 0;
    	int MN = 0;
    	int SN = 0;
    	//int MiL = 0;
    	int SiM = 0;
    	//int LiS = 0;

    	
    	for(int i = 0; i < b.length(); i++) {
    		if(b.charAt(i) == 'L') {
    			LN++;
    		}else if(b.charAt(i) == 'M') {
    			MN++;
    		}else {
    			SN++;
    		}
    	}
    	
    	
    	for(int j = 0; j < LN; j++) {//ZONE L
    		if(b.charAt(j) != 'L') {
    			swaps++;    			
    		}
    	}
    	for(int k = LN; k < MN+LN; k++) {//ZONE M
    		if(b.charAt(k) != 'M') {
    			swaps++;
    			if(b.charAt(k) == 'S') {
    				SiM++;
    				
    			}
    			
    		}
    	}
    	for(int l = MN+LN; l < SN+MN+LN; l++) {//ZONE S
    		if(b.charAt(l) != 'S') {
    			swaps++;
    			if(b.charAt(l) == 'M') {
    				SiM--;
    			}
    			
    		}
    	}
    	
    	SiM = Math.abs(SiM);
    	swaps = swaps - (SiM);
    	swaps = swaps /2;
    	swaps = swaps + (SiM);
    	System.out.println(swaps);
    	
    }
    
}
