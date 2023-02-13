import java.io.*;
import java.util.StringTokenizer;


public class Q1 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args) throws IOException{
        int u = readInt();
        int t = readInt();

        int v = (3 * t) + u;
        System.out.println(v);
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
