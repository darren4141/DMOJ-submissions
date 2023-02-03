//UNSOLVED

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CCC06S1 {
	static StringTokenizer st;
	static BufferedReader br;
	static ArrayList<Character> flag = new ArrayList<Character>();
	static String a;
	static String b;
	
	public static void main(String[]args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Boolean> message = new ArrayList<Boolean>();
		a = br.readLine();
		b = br.readLine();
		
		checkflag('a', 0);
		checkflag('A', 0);
		
		checkflag('b', 2);
		checkflag('B', 2);
		
		checkflag('c', 4);
		checkflag('C', 4);
		
		checkflag('d', 6);
		checkflag('D', 6);
		
		checkflag('e', 8);
		checkflag('E', 8);
		
		for(char c : flag) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		int n = readInt();
		
		for(int i = 0; i < n; i++) {
			String baby = br.readLine();
			boolean contains = false;
			for(char v : flag) {
				if(baby.contains(Character.toString(v))) {
					contains = true;
					break;
				}
			}
			message.add(contains);
		}
		
		for(boolean b : message) {
			System.out.println((b)? "Not their baby!" : "Possible baby.");
		}
	}
	
	static void checkflag(char check, int i) {
//		if((a.charAt(i+1) == check || b.charAt(i+1) == check) && check == Character.toUpperCase(check)) {
//			return;
//		}
		
		if(a.charAt(i) != check && b.charAt(i) != check) {
			if(!(a.charAt(i+1) == check && b.charAt(i+1) == check)) {
				flag.add(check);
			}
		}
	}
	
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
}
