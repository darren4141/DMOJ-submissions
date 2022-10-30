//https://dmoj.ca/submission/4985498

import java.io.*;
import java.util.StringTokenizer;
public class AvocadoTrees {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main (String[]args) throws IOException{
		int highest= 0;
		int size = readInt();
		int query = readInt();
		int max = readInt();
		
			int arr [] = new int [size + 1];
			int height[] = new int [size + 1];
			int psa [] = new int [size + 1];
			
			for(int i = 1; i <= size; i++) {
				height[i] = readInt(); arr[i] = readInt();
			}
			
			for(int i = 1; i<= size; i++) {
				if(height[i] <= max) {
					psa[i] = psa[i-1] + arr[i];

				}else {
					psa[i] = psa[i-1];
				}

			}
			
			for(int i = 1; i <= query; i++) {
				int left = readInt(); int right = readInt();
				if (psa[right] - psa[left-1] > highest) {
					highest = psa[right] - psa[left-1];
				}
				
			}
			System.out.println(highest);

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
