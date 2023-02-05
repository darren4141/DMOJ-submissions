//https://dmoj.ca/submission/4643172

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class BPC1J3 {
    public static void main(String[] args) throws IOException{    	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String [] ppl = br.readLine().split(" ");
    int [] a = new int [n*2];
    int complaints = 0;
    
    for(int i = 0; i < (n*2); i++) {
    	a[i] = Integer.parseInt(ppl[i]);
    }

    Arrays.sort(a);
    
    for(int i = 0; i < a.length; i+=2) {
    	complaints += (a[i+1] - a[i]);
    }
    
    System.out.println(complaints);
    
 	}
   
}
