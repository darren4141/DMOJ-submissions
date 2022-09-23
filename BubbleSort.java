//https://dmoj.ca/submission/4639250
import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException{    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int size = Integer.parseInt(br.readLine());
    	String [] strnum = new String[size];
    	int [] num = new int[size];
    	String nums = br.readLine();
    	strnum = nums.split(" ");
    	int temp = 0;
    	int count = 0;
    	boolean sorted = false;
    	
    	for(int i = 0; i < num.length; i++) {
    		num[i] = Integer.parseInt(strnum[i]);
    	}
    	
    	while(true) {
    		count = 0;
	    	for(int i = 0; i < size-1; i++) {
	    		if(num[i+1] < num[i]) {
	    			for(int j = 0; j < size; j++) {
			    		System.out.print(num[j] + " ");

	    			}
	    			temp = num[i];
	    			num[i] = num[i+1];
	    			num[i+1] = temp;
	    			count++;

		    		System.out.println();

	    		}
	    		
	    		
	    	}
	    	if(count == 0) {
	    		break;
	    	}
    	}
		for(int j = 0; j < size; j++) {
    		System.out.print(num[j] + " ");

		}
    	
    }
}
