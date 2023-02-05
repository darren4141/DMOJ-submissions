//https://dmoj.ca/submission/4641687

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GFSSOC15P4 {
    public static void main(String[] args) throws IOException{    	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    char [] DNA = new char[n];
    ArrayList<Integer> fibs = new ArrayList<Integer>();
    boolean acorrect = false;
    boolean bcorrect = false;
    int c = 0;
    	
    for(int i = 0; i < n; i++) {
    	DNA[i] = (char) br.read();	
    }
    
    int highestFib = 0;
    for(int i = 0; i < n; i++) {//CREATE ARRAY LIST WITH ALL RELEVANT FIBS   	
    	highestFib = fib(i+1);
    	if(highestFib > n) {
    		break;
    	}    	
    	fibs.add(highestFib);
    	
    }
    
    fibs.remove(0);
    
    for(int i = 1, y = 0; i <= n; i++) {//LOGIC
    	if(DNA[i-1] == 'A') {//IF CHAR IS A, CHECK IF INDEX IS A FIBONACCI NUMBER
    		c++;
    		if(c < fibs.size()) {
    			if(i == fibs.get(y)) {
        			acorrect = true;
        			y++;
        		}else {
        			acorrect = false;
        		}
    		}
    	}

        for(int f = 0; f < fibs.size(); f++) {//IF INDEX IS A FIBONACCI NUMBER, CHECK IF CHAR IS A
       		if(DNA[fibs.get(f)-1] == 'A') {
       			bcorrect = true;
       		}else {
       			bcorrect = false;
       		}
       	}
    	

    }
    
    if(n == 1 && DNA[0] == 'A') {
    	acorrect = true;
    	bcorrect = true;    	
    }else if(n == 2 && DNA[0] == 'A' && DNA[1] == 'A') {
    	acorrect = true;
    	bcorrect = true; 
    }
    
    if(acorrect && bcorrect) {
    	System.out.println("That's quite the observation!");
    }else {
    	System.out.println("Bruno, GO TO SLEEP");
    }
    
    }
    static int fib(int n) {
		if(n==1||n==2) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
 	}
   
}
