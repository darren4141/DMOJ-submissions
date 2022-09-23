//https://dmoj.ca/submission/4644552
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int mod = (int)1e9+7;

    public static void main(String[] args) throws IOException{    	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String sa = br.readLine();
    String sb = br.readLine();
    char [] a = new char[sa.length()];
    char [] b = new char[sb.length()];

    sa = sa.toLowerCase();
    sb = sb.toLowerCase();
    
    long atotal = 0;
    long btotal = 0;
    
    for(int i = 0; i < sa.length(); i++) {
    	a[i] = sa.charAt(i);
    }
    
    for(int i = 0; i < sb.length(); i++) {
    	b[i] = sb.charAt(i);
    }
    
    for(int i = 1; i <= a.length; i++) {
    	atotal += pow((int)a[i-1] - 96, i);
    }
    
    for(int i = 1; i <= b.length; i++) {
    	btotal += pow((int)b[i-1] - 96, i);
    }
    
    
    atotal = atotal%10;
    btotal = btotal%10;
    
    if(atotal == 0) {
    	atotal = 10;
    }
    
    if(btotal == 0) {
    	btotal = 10;
    }
    
    System.out.println(atotal+btotal);
 	}
    
   static long pow(long x, long y) {
    	if(y == 0) {
    		return 1;
    	}
    	long tmp = pow(x, y/2);
    	tmp = (tmp * tmp)%mod;
    	if(y%2 == 1) {
    		tmp = (tmp * x)%mod;
    	}
		return tmp%10;
    	
    }
}
