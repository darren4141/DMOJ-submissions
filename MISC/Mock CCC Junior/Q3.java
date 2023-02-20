import java.io.*;
import java.util.StringTokenizer;

public class Q3 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args) throws IOException{
        int n = readInt();
        int k = readInt();
        int m = readInt();

        int [] a = new int[n];
        int [] b = new int[n];
        

        for(int i = 0; i < n; i++)
            a[i] = readInt();
        
        for(int i = 0; i < n; i++)
            b[i] = readInt();

        
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }

        return st.nextToken();
    }

    static int readInt() throws IOException{
        return Integer.parseInt(next());
    }
}
