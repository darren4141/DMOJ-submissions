import java.io.*;
import java.util.StringTokenizer;

public class TCEP3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main (String []args) throws IOException {
		int length = readInt();
		int min = readInt();
		int q = readInt();
		int count = 0;
		
		int[] stations = new int[length];
		int[] difference = new int[length];
		
		for(int i = 0; i < difference.length; i++) difference[i] = 0;
		
		for(int i = 0; i < q; i++) {
			int left = readInt();
			int right = readInt();
			int troops = readInt();
			
			left--; right--;
			
			difference[left] += troops;
			if(right != length-1) {
				difference[right+1] -= troops;
			}
		}
		
		stations[0] = difference[0];
		
		if(stations[0] < min) {
			count++;
		}
		
		for(int i = 1; i < difference.length; i++) {
			stations[i] = stations[i-1] + difference[i];
			if(stations[i] < min) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
}