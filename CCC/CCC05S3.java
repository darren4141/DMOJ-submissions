import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CCC05S3{
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args) throws IOException {

        int n = readInt();
        ArrayList<Integer> mat[][];

        for(int i = 0; i < n; i++){
            
        }

    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());

        return st.nextToken();
    }

    static int readInt() throws IOException{return Integer.parseInt(next());}
}