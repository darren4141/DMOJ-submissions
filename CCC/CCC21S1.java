import java.util.Scanner;

public class CCC21S1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		int n = readInt();
		int [] h = new int[n+1];
		int [] b = new int[n];
		double total = 0;
		
		for(int i = 0; i <= n; i++) 
			h[i] = readInt();
		
		for(int i = 0; i < n; i++)
			b[i] = readInt();
		
		for(int i = 0; i < n; i++) {
			double size = 0;
			size = (double)(h[i] + h[i+1])*b[i]/2;
			total += size;
		}
		
		System.out.println(total);
	}
	
	static int readInt() {
		return Integer.parseInt(sc.next());
	}
	
}
