//SOLVED
//https://dmoj.ca/problem/ccc16s2
//TANDEM BICYCLE

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CCC16S2 {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	public static void main(String[]args) throws IOException{
		int mode = readInt();
		n = readInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> comb = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int in = readInt();
			a.add(in);
			comb.add(in);
		}
		
		for(int i = 0; i < n; i++) {
			int in = readInt();
			b.add(in);
			comb.add(in);
		}
		
		Collections.sort(a);
		Collections.sort(b);
		Collections.sort(comb);
		
		if(mode == 1) {
			System.out.println(calcLowest(a, b));
		}else if(mode == 2) {
			System.out.println(calcHighest(comb));
		}
		
		
	}
	
	//102 177 189 202 589
	//1   17  78  496 540
	
	static int calcLowest(ArrayList<Integer> a, ArrayList<Integer> b) {
		int total = 0;
		for(int i = 0; i < n; i++) {
			total += Math.max(a.get(i), b.get(i));

		}
		
		return total;
	}
	
	static int calcHighest(ArrayList<Integer> comb) {
		int total = 0;
		for(int i = 0; i < n; i++) {
			total+=comb.get(comb.size()-1-i);

		}
		
		return total;
	}
	
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		
		return st.nextToken();
	}
	
	static int readInt() throws IOException{return Integer.parseInt(next());}
}
