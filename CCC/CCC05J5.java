//https://dmoj.ca/submission/4634529

import java.io.*;
import java.util.*;

public class CCC05J5 {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	ArrayList<String> words = new ArrayList<String>();
    	int c = 0;
    	
    	while(true) {
    		words.add(br.readLine());
    		if(words.get(c).equals("X")){
    			words.remove(c);
    			break;
    		}
    		c++;

    	}
    	
    	for(int i = 0; i < words.size(); i++) {
    		
    		if(!(words.get(i).contains("A"))) {
    			System.out.println("NO");
    			continue;
    		}

	    	while(words.get(i).contains("B") && words.get(i).contains("S")) {
        			words.set(i, words.get(i).replaceFirst("B", "AN"));
    				words.set(i, words.get(i).replaceFirst("S", "NA"));    			    		
	    	}
	    	
    		while(words.get(i).contains("AN")) {
    			words.set(i, words.get(i).replace("AN", ""));
    			}
    		
    		if(words.get(i).equals("A")) {
    			System.out.println("YES");
    		}else if (words.get(i).equals(null)){
    			System.out.println("NO");
    		}else {
    			System.out.println("NO");
    		}    		   	   	    	
    }    	
}
}
